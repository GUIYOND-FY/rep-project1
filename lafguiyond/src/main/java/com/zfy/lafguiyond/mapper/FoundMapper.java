package com.zfy.lafguiyond.mapper;


import com.zfy.lafguiyond.entities.Found;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FoundMapper {
    Integer insert(Found found);

    Integer deleteBySid(Integer sid);

    Integer updateExceptImage(Found found);

    Integer updateImage(String image,Integer sid);

    Integer uploadImage(String image);

    Found foundBySid(Integer sid);

    List<Found> findRecentFound();

    List<Found> findAllFound();

    List<Found> foundByAddress(String address);

    List<Found> foundById(Integer id);

    Integer findNewSid();

    List<Found> findMohu(@Param("key_word1") String keyWord1);
}
