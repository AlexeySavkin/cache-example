package com.example.cache.repository;

import com.example.cache.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GroupRepository extends JpaRepository<GroupEntity, UUID> {
}
