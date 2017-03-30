package com.pm.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PawelM on 2017-03-30.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}
