package com.zfy.lafguiyond.mapper;

import com.zfy.lafguiyond.entities.Found;
import com.zfy.lafguiyond.entities.Lost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LostMapper {
    Integer uploadImage(String image);

    Integer updateExceptImage(Lost lost);

    Integer findNewSid();

    List<Lost> findAllLosts();

    Lost findBySid(Integer sid);

    List<Lost> findByAddress(String address);

    List<Lost> findById(Integer id);

    Integer deleteBySid(Integer sid);

    List<Lost> findRecentLost();

    List<Lost> findMohu(@Param("lkey_word1") String lkeyWord1);
}
