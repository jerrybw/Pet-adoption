package com.pet.controller;

import com.pet.entity.User;
import com.pet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by acer on 2017/7/29.
 */
@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("login")
    public String login(@RequestBody User user, HttpSession session){
        User result = userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
        if (result != null){
            session.setAttribute("user",result);
        }
        return result != null?"success":"failed";
    }
}
