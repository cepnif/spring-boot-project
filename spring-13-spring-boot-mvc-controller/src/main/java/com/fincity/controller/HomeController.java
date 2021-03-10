package com.fincity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getRequestMapping1(){
        return "home";
    }

    @GetMapping("/home")
    public String getRequestMapping2(){
        return "home";
    }

    @GetMapping("/fincity")
    public String getRequestMapping3(){
        return "home";
    }

    @GetMapping("/home/{name}/{id}")
    public String getRequestMapping4(@PathVariable("name") String name, @PathVariable("id") String id){
        System.out.println("Name is " + name);
        System.out.println("Id is " + id);
        return "home";
    }


}
