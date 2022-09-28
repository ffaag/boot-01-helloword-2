package com.it.boot.controller;

import com.it.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZuYingFang
 * @time 2021-09-11 17:52
 */

@RestController
public class HelloController {

    @Autowired
    private Person person;


    @RequestMapping("/person")
    public Person person(){
        return person;
    }



}
