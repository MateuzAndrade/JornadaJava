package com.mateuserp.sistemagestaodeobras.model;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class AbstractEntity <ID extends Serializable> implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

}
