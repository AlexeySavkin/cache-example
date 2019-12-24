package com.example.cache.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@MappedSuperclass
public class HeadEntity {

    @Id
    @Column(name = "id")
    private UUID id;
}
