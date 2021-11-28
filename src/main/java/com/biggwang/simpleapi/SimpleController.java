package com.biggwang.simpleapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class SimpleController {

    @GetMapping("/api/simple")
    public String simple() {
        return "welcome to biggwang's api server: " + LocalDateTime.now();
    }
}
