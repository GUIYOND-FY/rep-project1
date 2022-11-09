package com.zfy.lafguiyond.service;

import com.github.pagehelper.PageInfo;
import com.zfy.lafguiyond.entities.Found;
import com.zfy.lafguiyond.entities.Lost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LostServiceTest {
    @Autowired
    private LostService lostService;

    @Test
    public void uploadImage(){
        lostService.uploadImage("321",9);
        System.out.println("success");
    }

    @Test
    public void updateExceptImage(){
        Lost lost = new Lost();
        lost.setLaddress("9999");
        lost.setLcontact("993");
        lost.setLsid(3);
        lostService.updateLostExceptImage(lost,8);
    }

    @Test
    public void findAlLosts(){
        List<Lost> losts = lostService.findAllLosts();
        for (Lost lost : losts) {
            System.out.println(lost);
        }
    }

    @Test
    public void findBySid(){
        Lost result = lostService.findBySid(8);
        System.out.println(result);
    }

    @Test
    public void findByAddress(){
        List<Lost> result = lostService.findByAddress("教一");
        for (Lost lost : result) {
            System.out.println(lost);
        }
    }

    @Test
    public void findById(){
        List<Lost> data = lostService.findById(9);
        for (Lost datum : data) {
            System.out.println(datum);
        }
    }

    @Test
    public void deleteBySid(){
        lostService.deleteBySid(14);
        System.out.println("success");
    }

    @Test
    public void findRecentLost(){
        List<Lost> result = lostService.findRecentLost();
        for (Lost lost : result) {
            System.out.println(lost);
        }
    }

    @Test
    public void findMohu(){
        List<Lost> result = lostService.findMohu("笔");
        for (Lost lost : result) {
            System.out.println(lost);
        }
    }
}
