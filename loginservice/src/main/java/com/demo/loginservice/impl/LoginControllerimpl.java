package com.demo.loginservice.impl;

import com.demo.loginservice.models.LoginEnity;
import com.demo.loginservice.api.LoginController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginControllerimpl implements LoginController {


    @Override
    public LoginEnity login() {

        System.out.println("Success");
        return new LoginEnity();
//        this.getAllUsers();

    }


//    public List<LoginEntity> getAllUsers() {
//        return LoginRepository.findAll();
//
//    }
}
