package com.gupiao.gupiao.entity;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Login {
    @Id
    private String account;
    private String password;
}
