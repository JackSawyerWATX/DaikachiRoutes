package com.jonathan.firstProject1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
	 @RequestMapping("/cruel")
     // 3. Method that maps to the request route above
     public String hello() { // 3
             return "Hello, Cruel World!";
     }
}