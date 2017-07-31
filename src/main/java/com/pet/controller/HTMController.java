package com.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 向博文 on 2017/7/31.
 */
@Controller
public class HTMController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
