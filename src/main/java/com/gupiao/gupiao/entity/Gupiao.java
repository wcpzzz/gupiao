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

    public Integer getATOM_ID() {
        return ATOM_ID;
    }

    public void setATOM_ID(Integer ATOM_ID) {
        this.ATOM_ID = ATOM_ID;
    }

    public String getATOM_NAME() {
        return ATOM_NAME;
    }

    public void setATOM_NAME(String ATOM_NAME) {
        this.ATOM_NAME = ATOM_NAME;
    }

    public String getATOM_SUMMARY() {
        return ATOM_SUMMARY;
    }

    public void setATOM_SUMMARY(String ATOM_SUMMARY) {
        this.ATOM_SUMMARY = ATOM_SUMMARY;
    }
}
