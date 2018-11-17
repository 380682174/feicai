package com.fish.learn.serviceribbon.controller;

import com.fish.learn.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author devin.jiang
 * @CreateDate 2018/11/17 0:25
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;


    @GetMapping("/hi")
    public String hi(@RequestParam(value="name") String name){
        return helloService.hiService(name);
    }


}
