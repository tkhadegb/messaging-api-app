package org.example.messagingapiapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")

public class AccountController {


    @GetMapping("oracle")
    public String oracle(){
        return "Hi Oracle!!";
    }

    @GetMapping
    public String sayHello(){
        return "Hi Guest!!";
    }


}