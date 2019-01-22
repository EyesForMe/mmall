package com.xxx.controller;

import com.xxx.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Demo {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/welcome")
    public String visitIndex(){

        System.out.println("转发到 welcome");
        return "welcome";
    }

    @RequestMapping("/testFindAllAccount")
    public String testFindAllAccount(){
        List<Account> list = accountService.findAll();
        System.out.println(list);

        return "welcome";
    }
}
