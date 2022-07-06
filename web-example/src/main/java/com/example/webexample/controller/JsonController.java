package com.example.webexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Author: 高杰
 * Date: 2022/7/6
 * Desc:
 */
@RestController
@RequestMapping("/json")
public class JsonController {

    @GetMapping("/get")
    public Object get() {
        return new HashMap<String,Object>() {{
            put("code",200);
        }};

    }
}
