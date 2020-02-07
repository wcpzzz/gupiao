package com.gupiao.gupiao.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Gupiao {
    @Id
    private Integer ATOM_ID;
    private String ATOM_NAME;
    private String ATOM_SUMMARY;

}
