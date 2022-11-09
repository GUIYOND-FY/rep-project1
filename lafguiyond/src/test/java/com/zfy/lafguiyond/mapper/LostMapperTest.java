package com.zfy.lafguiyond.mapper;

import com.zfy.lafguiyond.entities.Found;
import com.zfy.lafguiyond.entities.Lost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LostMapperTest {
    @Autowired
    private LostMapper lostMapper;

    @Test
    public void uploadImage(){
        Integer integer = lostMapper.uploadImage("123");
        System.out.println(integer);
    }

    @Test
    public void updateExceptImage(){
        Lost lost = new Lost();
        lost.setId(8);
        lost.setLaddress("123");
        lost.setLcontact("123");
        lost.setLsid(3);
        lostMapper.updateExceptImage(lost);
    }

    @Test
    public void findNewSid(){
        Integer sid = lostMapper.findNewSid();
        System.out.println(sid);
    }

    @Test
    public void findAllLosts(){
        List<Lost> losts = lostMapper.findAllLosts();
        for (Lost lost : losts) {
            System.out.println(lost);
        }
    }
    @Test
    public void findByAddress(){
        List<Lost> lost = lostMapper.findByAddress("教一");
        System.out.println(lost);
    }

    @Test
    public void findMohu(){
        List<Lost> result = lostMapper.findMohu("笔");
        for (Lost lost : result) {
            System.out.println(lost);
        }
    }








}
