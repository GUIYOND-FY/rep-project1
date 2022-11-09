package com.zfy.lafguiyond.service;

import com.github.pagehelper.PageInfo;
import com.zfy.lafguiyond.entities.Found;
import com.zfy.lafguiyond.entities.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoundServiceTest {
    @Autowired
    private FoundService foundService;

    @Test
    public void testPage(){
        PageInfo info = foundService.queryAllByPage(1,5);
        System.out.println(info);
    }

    @Test
    public void delete(){
        foundService.deleteBySid(10);
        System.out.println("success");
    }

    @Test
    public void find(){
        List<Found> allFound = foundService.findAllFound();
        for (Found found : allFound) {
            System.out.println(found);
        }
    }

    @Test
    public void testDelete(){
        foundService.deleteBySid(82);
        System.out.println("success");
    }

    @Test
    public void findBySid(){
        List<Found> result = foundService.findById(9);
        System.out.println(result);
    }

    @Test
    public void findMohu(){
        List<Found> result = foundService.findMohu("手机");
        for (Found found : result) {
            System.out.println(found);
        }
    }
}
