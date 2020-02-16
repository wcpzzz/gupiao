package com.gupiao.gupiao.repository;
import com.gupiao.gupiao.entity.Gupiao;
import com.gupiao.gupiao.entity.Login;
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
@SpringBootTest
class LoginReposityTest {
    @Autowired
    private LoginReposity loginReposity;
    @Test
    void findById(){
        Login login = loginReposity.findByAccountAndPassword("wcp","wcp123");
        System.out.println(login);
    }
}
