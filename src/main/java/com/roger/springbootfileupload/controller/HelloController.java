package com.roger.springbootfileupload.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RogerLo
 * @date 2025/1/17
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hola")
    public String hello() {
        return "Hola Worlddddd!";
    }

}
