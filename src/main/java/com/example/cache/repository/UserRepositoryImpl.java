package com.example.cache.repository;

import com.example.cache.entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Пример использования кастомных sql-запросов
 */
public class UserRepositoryImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UserEntity> getUsersByName(String name) {
        Query query = entityManager.createQuery("SELECT u FROM UserEntity u WHERE UPPER(u.name) LIKE CONCAT('%',  UPPER(:name), '%')");
        query.setParameter("name", name);

        return query.getResultList();
    }
}
