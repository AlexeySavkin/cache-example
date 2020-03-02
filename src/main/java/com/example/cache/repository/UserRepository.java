package com.example.cache.repository;

import com.example.cache.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID>, UserRepositoryCustom {

    @NotNull
    @Query("SELECT u " +
            "FROM UserEntity u " +
            "LEFT JOIN FETCH u.group g ")
    List<UserEntity> getUsersAndGroups();
}
