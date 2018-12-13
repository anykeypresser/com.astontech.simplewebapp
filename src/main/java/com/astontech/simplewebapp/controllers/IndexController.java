package com.astontech.simplewebapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String indexMethod() {
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a").format(new Date());
        return "Simple Web App Running - " + timeStamp;
    }
}
