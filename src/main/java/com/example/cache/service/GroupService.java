package com.example.cache.service;

import com.example.cache.entity.GroupEntity;
import com.example.cache.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;

    @NotNull
    public GroupEntity getGroup(UUID id) {
        return groupRepository.getOne(id);
    }

    @NotNull
    @Cacheable("getGroups")
    public List<GroupEntity> getGroups() {
        return groupRepository.findAll();
    }
}
