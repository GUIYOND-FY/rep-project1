package com.zfy.lafguiyond.mapper;

import com.zfy.lafguiyond.entities.Found;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoundMapperTest {
    @Autowired
    private FoundMapper foundMapper;

    @Test
    public void insert(){
        Found found = new Found();
        found.setTitle("找到一本书");
        found.setType("123");
        found.setKeyWord1("书");
        found.setKeyWord2("蓝色");
        found.setKeyWord3("dfaef");
        found.setAddress("南校区北门");
        found.setRealAddress("2234");
        found.setTime(new Date());
        found.setName("guiyond");
        found.setContact("123");
        found.setDetail("123");
        found.setImage("213");
        foundMapper.insert(found);
    }

    @Test
    public void updateImage(){
        String image = "/upload/avatar.png";
        Integer integer = foundMapper.updateImage(image,15);
        System.out.println(integer);
    }

    @Test
    public void foundBySid(){
        Found found = foundMapper.foundBySid(1);
        System.out.println(found);
    }

    @Test
    public void findRecentFound(){
        List<Found> result = foundMapper.findRecentFound();
        for (Found found : result) {
            System.out.println(found);
        }
    }

    @Test
    public void findAllFound(){
        List<Found> result = foundMapper.findAllFound();
        for (Found found : result) {
            System.out.println(found);
        }
    }

    @Test
    public void foundByAddress(){
        List<Found> result = foundMapper.foundByAddress("南校区");
        for (Found found : result) {
            System.out.println(found);
        }
    }

    @Test
    public void updateExceptImage(){
        Found found = new Found();
        found.setTitle("找到一本书");
        found.setType("123");
        found.setKeyWord1("书");
        found.setKeyWord2("蓝色");
        found.setKeyWord3("dfaef");
        found.setAddress("南校区北门");
        found.setRealAddress("2234");
        found.setTime(new Date());
        found.setName("guiyond");
        found.setContact("123");
        found.setDetail("123");
        found.setImage("213");
        found.setSid(41);
        foundMapper.updateExceptImage(found);
    }

    @Test
    public void findById(){
        List<Found> founds = foundMapper.foundById(9);
        for (Found found : founds) {
            System.out.println(found);
        }
    }

    @Test
    public void findMohu(){
        List<Found> founds = foundMapper.findMohu("手机");
        for (Found found : founds) {
            System.out.println(found);
        }
    }


}
