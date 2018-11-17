package com.fish.learn.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author devin.jiang
 * @CreateDate 2018/11/17 1:44
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
