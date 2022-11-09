package com.zfy.lafguiyond.controller;


import com.github.pagehelper.PageInfo;
import com.zfy.lafguiyond.controller.ex.*;
import com.zfy.lafguiyond.entities.Found;
import com.zfy.lafguiyond.entities.Lost;
import com.zfy.lafguiyond.service.FoundService;
import com.zfy.lafguiyond.service.LostService;
import com.zfy.lafguiyond.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("losts")
public class LostController extends BaseController{
    @Autowired
    private LostService lostService;

    @RequestMapping("add_lost")
    public JsonResult<Void> add(Lost lost, HttpSession session) {
        Integer id = Integer.valueOf(session.getAttribute("id").toString());
        lostService.updateLostExceptImage(lost,id);
        return new JsonResult<>(OK);
    }

    /**上传照片*/

    /** 头像文件大小的上限值(10MB) */
    public static final int AVATAR_MAX_SIZE = 10 * 1024 * 1024;
    /** 允许上传的头像的文件类型 */
    public static final List<String> AVATAR_TYPES = new ArrayList<String>();

    /** 初始化允许上传的头像的文件类型 */
    static {
        AVATAR_TYPES.add("image/jpeg");
        AVATAR_TYPES.add("image/png");
        AVATAR_TYPES.add("image/bmp");
        AVATAR_TYPES.add("image/gif");
    }

    @PostMapping("upload_image_lost")
    public JsonResult<String> uploadImage(@RequestParam("file") MultipartFile file,HttpSession session) {
        // 判断上传的文件是否为空
        if (file.isEmpty()) {
            // 是：抛出异常
            throw new FileEmptyException("上传的图片文件不允许为空");
        }

        // 判断上传的文件大小是否超出限制值
        if (file.getSize() > AVATAR_MAX_SIZE) { // getSize()：返回文件的大小，以字节为单位
            // 是：抛出异常
            throw new FileSizeException("不允许上传超过" + (AVATAR_MAX_SIZE / 1024) + "KB的图片文件");
        }

        // 判断上传的文件类型是否超出限制
        String contentType = file.getContentType();
        // public boolean list.contains(Object o)：当前列表若包含某元素，返回结果为true；若不包含该元素，返回结果为false。
        if (!AVATAR_TYPES.contains(contentType)) {
            // 是：抛出异常
            throw new FileTypeException("不支持使用该类型的文件作为头像，允许的文件类型：\n" + AVATAR_TYPES);
        }

        // 获取当前项目的绝对磁盘路径
        String parent = session.getServletContext().getRealPath("upload");
        // 保存图片文件的文件夹
        File dir = new File(parent);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // 保存的图片文件的文件名
        String suffix = "";
        String originalFilename = file.getOriginalFilename();
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex > 0) {
            suffix = originalFilename.substring(beginIndex);
        }
        String filename = UUID.randomUUID().toString() + suffix;

        // 创建文件对象，表示保存的照片文件
        File dest = new File(dir, filename);
        // 执行保存照片文件
        try {
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // 抛出异常
            throw new FileStateException("文件状态异常，可能文件已被移动或删除");
        } catch (IOException e) {
            // 抛出异常
            throw new FileUploadIOException("上传文件时读写错误，请稍后重尝试");
        }

        // 图片路径
        String image = "/upload/" + filename;
        // 将图片写入到数据库中
//        foundService.uploadImage(image);
        Integer id = Integer.valueOf(session.getAttribute("id").toString());
        lostService.uploadImage(image,id);
        // 返回成功图片路径
        return new JsonResult<String>(OK, image);
    }

    @GetMapping("lost")
    public JsonResult<List<Lost>> findAllLosts() {
        List<Lost> data = lostService.findAllLosts();
        return new JsonResult<>(OK,data);
    }

    @GetMapping("{sid}/found_detail_lost")
    public JsonResult<Lost> findBySid(@PathVariable("sid") Integer sid){

        Lost data = lostService.findBySid(sid);
        return new JsonResult<Lost>(OK, data);
    }

    @GetMapping("{address}/found_by_address_lost")
    public JsonResult<List<Lost>> foundByAddress(@PathVariable("address") String address){
        List<Lost> data = lostService.findByAddress(address);
        return new JsonResult<List<Lost>>(OK, data);
    }

    @GetMapping("found_by_id_lost")
    public JsonResult<List<Lost>> foundById(HttpSession session){
        Integer id = Integer.valueOf(session.getAttribute("id").toString());
        List<Lost> data = lostService.findById(id);
        return new JsonResult<>(OK,data);
    }

    @RequestMapping("{sid}/delete_lost")
    public JsonResult<Void> delete(@PathVariable("sid") Integer sid){
        lostService.deleteBySid(sid);
        return new JsonResult<>(OK);
    }

    @GetMapping({"", "/"})
    public JsonResult<List<Lost>> findRecentFound() {
        List<Lost> data = lostService.findRecentLost();
        return new JsonResult<List<Lost>>(OK, data);
    }

    @GetMapping("{keyWord1}/found_mohu_lost")
    public JsonResult<List<Lost>> findMohu(@PathVariable("keyWord1") String keyWord1){
        List<Lost> data = lostService.findMohu(keyWord1);
        return new JsonResult<>(OK,data);
    }




}
