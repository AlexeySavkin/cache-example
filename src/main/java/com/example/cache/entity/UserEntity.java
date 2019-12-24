package com.example.cache.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "user", schema = "cache")
@Accessors(chain = true)
public class UserEntity extends HeadEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private GroupEntity group;

    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + super.getId() + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
