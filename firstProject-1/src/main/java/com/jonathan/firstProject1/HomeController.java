package com.jonathan.firstProject1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/hello")
public class HomeController {
	
        @RequestMapping("/")
        public String hello() {
                return "Hello, Cruel World!";
        }
        @RequestMapping("/hello/{adjective}")
        public String world(@PathVariable String adjective) {
                return String.format ("Hello, %s World!", adjective);
        }
}