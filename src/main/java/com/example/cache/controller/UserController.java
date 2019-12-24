package com.example.cache.controller;

import com.example.cache.entity.GroupEntity;
import com.example.cache.entity.UserEntity;
import com.example.cache.service.GroupService;
import com.example.cache.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final GroupService groupService;

    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/users")
    public String getUsers() {
        return userService.getUsers().toString();
    }

    @GetMapping(value = "/user/{id}")
    public String getUser(@PathVariable("id") UUID id) {
        UserEntity user = userService.getUser(id);

        return user.toString();
    }

    @GetMapping("/groups")
    public String getGroups() {
        return groupService.getGroups().toString();
    }

    @GetMapping(value = "/group/{id}")
    public String getGroup(@PathVariable("id") UUID id) {
        GroupEntity group = groupService.getGroup(id);

        return group.toString();
    }
}
