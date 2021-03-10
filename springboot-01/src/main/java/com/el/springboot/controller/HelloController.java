package com.el.springboot.controller;

import com.el.springboot.bean.Car;
import com.el.springboot.bean.Person;
//import com.el.springboot.bean.Person01;
import com.el.springboot.bean.Person01;
import com.el.springboot.bean.User;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @author Roman.Zhang
 * @description TODO
 * </p >
 * @date 2021/3/6
 */
@RestController
public class HelloController {

    @Autowired
    Person person;

    @Autowired
    Person01 person1;

    @Autowired
    User user;

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "hello world Spring boot web project";
    }

    @GetMapping("/person")
    public Person person(){
        return person;
    }

    @Autowired
    Car car;


    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @RequestMapping("/user")
    public User user(){
        return user;
    }
}
