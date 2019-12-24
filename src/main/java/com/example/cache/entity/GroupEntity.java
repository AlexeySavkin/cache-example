package com.example.cache.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "group", schema = "cache")
@Accessors(chain = true)
public class GroupEntity extends HeadEntity {

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(targetEntity = UserEntity.class, mappedBy = "group", fetch = FetchType.LAZY)
    private Set<UserEntity> users;

    @Override
    public String toString() {
        return "GroupEntity{" +
                "id='" + super.getId() + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

