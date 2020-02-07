package com.gupiao.gupiao.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class GupiaoReposityTest {
    @Autowired
    private GupiaoReposity gupiaoReposity;
    @Test
    void findAll(){
        System.out.println(gupiaoReposity.findAll());
    }
}
