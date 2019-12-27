package com.example.cache.repository;

import com.example.cache.entity.UserEntity;

import java.util.List;

public interface UserRepositoryCustom {

    List<UserEntity> getUsersByName(String name);
}
