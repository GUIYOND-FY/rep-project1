package com.zfy.lafguiyond.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zfy.lafguiyond.entities.Found;
import com.zfy.lafguiyond.mapper.FoundMapper;
import com.zfy.lafguiyond.service.FoundService;
import com.zfy.lafguiyond.service.ex.DeleteException;
import com.zfy.lafguiyond.service.ex.FoundDuplicatedException;
import com.zfy.lafguiyond.service.ex.InsertException;
import com.zfy.lafguiyond.service.ex.UserEmptyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Service
public class FoundServiceImpl implements FoundService {
    @Autowired
    private FoundMapper foundMapper;
    @Override
    public void addFound(Found found, Integer id) {
        Found result = foundMapper.foundBySid(found.getSid());
        if(id==null){
            throw new UserEmptyException("请先登录");
        }
        if(result!=null){
            throw new FoundDuplicatedException("该失物招领已存在");
        }
        found.setTime(new Date());
        Integer rows = foundMapper.insert(found);
        if(rows!=1){
            throw new InsertException("添加数据时产生未知错误");
        }
    }

    @Override
    public void deleteBySid(Integer sid) {
        Integer rows = foundMapper.deleteBySid(sid);
        if(rows!=1){
            throw new DeleteException("删除数据时产生未知错误");
        }
    }

    @Override
    public void updateFoundExceptImage(Found found,Integer id) {
        if(id==null){
            throw new UserEmptyException("请先登录");
        }
        Integer sid = foundMapper.findNewSid();
        found.setTime(new Date());
        found.setSid(sid);
        found.setId(id);
        Integer rows = foundMapper.updateExceptImage(found);
        if(rows!=1){
            throw new InsertException("添加数据时产生未知错误");
        }
    }

    @Override
    public void updateImage(String image) {
        Integer sid = foundMapper.findNewSid();
        Integer rows = foundMapper.updateImage(image, sid);
        if(rows!=1){
            throw new InsertException("添加数据时产生未知错误");
        }
    }

    @Override
    public void uoloadImage(String image,Integer id) {
        if(id==null){
            throw new UserEmptyException("请先登录");
        }
        Integer rows = foundMapper.uploadImage(image);
        if(rows!=1){
            throw new InsertException("添加数据时产生未知错误");
        }
    }

    @Override
    public Found foundBySid(Integer sid) {
        Found found = foundMapper.foundBySid(sid);
        return found;
    }


    @Override
    public List<Found> findRecentFound() {
        List<Found> list = foundMapper.findRecentFound();
        return list;
    }

    @Override
    public List<Found> findAllFound() {

        List<Found> list = foundMapper.findAllFound();
        return list;
    }

    @Override
    public PageInfo queryAllByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        try {
            List<Found> founds = foundMapper.findAllFound();
            PageInfo pageInfo = new PageInfo(founds);
            return pageInfo;
        }finally {
            PageHelper.clearPage(); //清理 ThreadLocal 存储的分页参数,保证线程安全
        }

    }


    @Override
    public List<Found> foundByAddress(String address) {
        List<Found> list = foundMapper.foundByAddress(address);
        return list;
    }

    @Override
    public List<Found> findById(Integer id) {
        List<Found> founds = foundMapper.foundById(id);
        return founds;
    }

    @Override
    public Integer findNewSid() {
        Integer sid = foundMapper.findNewSid();
        return sid;
    }

    @Override
    public List<Found> findMohu(String keyWord1) {
        List<Found> result = foundMapper.findMohu(keyWord1);
        return result;
    }
}
