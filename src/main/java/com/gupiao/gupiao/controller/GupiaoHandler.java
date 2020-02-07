package com.gupiao.gupiao.controller;

import com.gupiao.gupiao.entity.Gupiao;
import com.gupiao.gupiao.repository.GupiaoReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gupiao")
public class GupiaoHandler {
    @Autowired
    private GupiaoReposity gupiaoReposity;
    @GetMapping("/findAll")
    public List<Gupiao> findAll(){
        return gupiaoReposity.findAll();
    }
}
