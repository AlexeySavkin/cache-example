package com.example.cache.service;

import com.example.cache.entity.UserEntity;
import com.example.cache.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @NotNull
    public UserEntity getUser(UUID id) {
        return userRepository.getOne(id);
    }

    @NotNull
    @Cacheable("getUsers")
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}
