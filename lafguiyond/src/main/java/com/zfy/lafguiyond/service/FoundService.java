package com.zfy.lafguiyond.service;


import com.github.pagehelper.PageInfo;
import com.zfy.lafguiyond.entities.Found;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface FoundService {
    void addFound(Found found, Integer id);

    void deleteBySid(Integer sid);

    void updateFoundExceptImage(Found found,Integer id);

    void updateImage(String image);

    void uoloadImage(String image,Integer id);

    Found foundBySid(Integer sid);

    List<Found> findRecentFound();

    List<Found> findAllFound();

    PageInfo queryAllByPage(Integer pageNum,Integer pageSize);

    List<Found> foundByAddress(String address);

    List<Found> findById(Integer id);

    Integer findNewSid();

    List<Found> findMohu(String keyWord1);
}
