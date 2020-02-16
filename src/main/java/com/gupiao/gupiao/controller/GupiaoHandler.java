package com.gupiao.gupiao.controller;
import com.gupiao.gupiao.entity.Gupiao;
import com.gupiao.gupiao.entity.Login;
import com.gupiao.gupiao.repository.GupiaoReposity;
import com.gupiao.gupiao.repository.LoginReposity;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/gupiao")
public class GupiaoHandler {
    @Autowired
    private GupiaoReposity gupiaoReposity;
    @Autowired
    private LoginReposity loginReposity;
    @GetMapping("/findAll")
    public List<Gupiao> findAll(){
        return gupiaoReposity.findAll();
    }
    @PostMapping("/login")
    public Login login(@RequestParam(value="account",required=false) String account,
                       @RequestParam(value="password",required=false) String password){
//        String account =  jsonObject.get("account").toString();
//        String password =  jsonObject.get("password").toString();
//        String account=request.getParameter("account");
//        String password=request.getParameter("password");
        System.out.println(account);
        Login login = loginReposity.findByAccountAndPassword(account,password);
        return login;
    }
}
