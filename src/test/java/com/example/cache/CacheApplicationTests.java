//package com.example.cache;
//
//import com.example.cache.entity.UserEntity;
//import com.example.cache.service.UserService;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.UUID;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
////@RequiredArgsConstructor
//public class CacheApplicationTests {
//
//    @Autowired
//    private UserService userService;
//
//    @Test
//    public void canGetUser() {
//        UserEntity user = userService.getUser(UUID.fromString("f024f320-df66-11e9-9bdb-a86daaf04259"));
//
//        Assert.assertNotNull(user);
//    }
//
//}
//
