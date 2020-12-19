package com.itgaoshu.contorller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("test1.do")
    public String test1(){

        return "login.html";
                }
}
