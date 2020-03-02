package com.example.cache.service;

import com.example.cache.domain.dto.UserInfo;
import com.example.cache.entity.UserEntity;
import com.example.cache.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CacheService {

    private final UserRepository userRepository;

    @Cacheable("getAllUserInfo")
    public List<UserInfo> getAllUserInfo() {
        return userRepository.getUsersAndGroups()
                .stream()
                .map(userEntity -> new UserInfo(userEntity.getName(), userEntity.getGroup().getName()))
                .collect(Collectors.toList());
    }

    public List<UserEntity> getUsersByName(String name) {
        return userRepository.getUsersByName(name);
    }
}
