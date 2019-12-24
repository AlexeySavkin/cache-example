package com.example.cache.service;

import com.example.cache.entity.UserEntity;
import com.example.cache.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserEntity getUser(UUID id) {
        return userRepository.getOne(id);
    }

    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}
