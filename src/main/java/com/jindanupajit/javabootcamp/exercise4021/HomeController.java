package com.jindanupajit.javabootcamp.exercise4021;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(path = "/", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String response() {
        return "<html><title>Test</title><body><h1>Test Page OK!</h1></body></html>";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
