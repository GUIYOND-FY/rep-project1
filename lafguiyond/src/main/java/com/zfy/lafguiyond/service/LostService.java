package com.zfy.lafguiyond.service;


import com.github.pagehelper.PageInfo;
import com.zfy.lafguiyond.entities.Found;
import com.zfy.lafguiyond.entities.Lost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LostService {




    void updateLostExceptImage(Lost lost, Integer id);

    void uploadImage(String image, Integer id);

    List<Lost> findAllLosts();

    Lost findBySid(Integer sid);

    List<Lost> findByAddress(String address);

    List<Lost> findById(Integer id);

    void deleteBySid(Integer sid);

    List<Lost> findRecentLost();

    List<Lost> findMohu(String lkeyWord1);

}
