package com.example.demo.controller;

import com.example.demo.model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloRestController {
    @GetMapping("hello-string")
    public String helloString(String name) {
        return String.format("Hello, %s", name);
    }

    @GetMapping("hello-map")
    public Map<String, Object> helloMap(String name) {
        HashMap<String, Object> m = new HashMap<>();
        m.put("name", name);
        return m;
    }

    @GetMapping("hello-object")
    public Hello helloObject(String name) {
        Hello h = new Hello(name);
        return h;
    }
}
