package com.example.apiandroid.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
        @GetMapping("/test")
        @ResponseBody
        public String test() {
            return "1";  // Trả về chuỗi thô mà không cần template
        }
}
