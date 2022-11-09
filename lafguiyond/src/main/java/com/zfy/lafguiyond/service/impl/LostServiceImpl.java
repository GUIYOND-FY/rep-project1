package com.zfy.lafguiyond.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zfy.lafguiyond.entities.Found;
import com.zfy.lafguiyond.entities.Lost;
import com.zfy.lafguiyond.mapper.FoundMapper;
import com.zfy.lafguiyond.mapper.LostMapper;
import com.zfy.lafguiyond.service.FoundService;
import com.zfy.lafguiyond.service.LostService;
import com.zfy.lafguiyond.service.ex.DeleteException;
import com.zfy.lafguiyond.service.ex.FoundDuplicatedException;
import com.zfy.lafguiyond.service.ex.InsertException;
import com.zfy.lafguiyond.service.ex.UserEmptyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LostServiceImpl implements LostService {
    @Autowired
    private LostMapper lostMapper;

    @Override
    public void updateLostExceptImage(Lost lost, Integer id) {
        if(id==null){
            throw new UserEmptyException("请先登录");
        }
        Integer sid = lostMapper.findNewSid();
        lost.setLtime(new Date());
        lost.setLsid(sid);
        lost.setId(id);
        Integer rows = lostMapper.updateExceptImage(lost);
        if(rows!=1){
            throw new InsertException("添加数据时产生未知错误");
        }
    }

    @Override
    public void uploadImage(String image,Integer id) {
        if(id==null){
            throw new UserEmptyException("请先登录");
        }
        Integer rows = lostMapper.uploadImage(image);
        if(rows!=1){
            throw new InsertException("添加数据时产生未知错误");
        }
    }

    @Override
    public List<Lost> findAllLosts() {
        List<Lost> losts = lostMapper.findAllLosts();
        return losts;
    }

    @Override
    public Lost findBySid(Integer sid) {
        Lost result = lostMapper.findBySid(sid);
        return result;
    }

    @Override
    public List<Lost> findByAddress(String address) {
        List<Lost> result = lostMapper.findByAddress(address);
        return result;
    }

    @Override
    public List<Lost> findById(Integer id) {
        List<Lost> result = lostMapper.findById(id);
        return result;
    }

    @Override
    public void deleteBySid(Integer sid) {
        Integer rows = lostMapper.deleteBySid(sid);
        if(rows!=1){
            throw new DeleteException("删除数据时产生未知异常");
        }
    }

    @Override
    public List<Lost> findRecentLost() {
        List<Lost> result = lostMapper.findRecentLost();
        return result;
    }

    @Override
    public List<Lost> findMohu(String lkeyWord1) {
        List<Lost> result = lostMapper.findMohu(lkeyWord1);
        return result;
    }


}
