/*************  ✨ Codeium Command ⭐  *************/
package com.example.demo_copilot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/")
    public String hello() {
        return "Hola mundo!";
    }
}
/******  4f2e5084-68de-4fda-bbb9-e76bc8aaa417  *******/