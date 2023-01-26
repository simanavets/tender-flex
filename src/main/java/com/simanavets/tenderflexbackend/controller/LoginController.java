package com.simanavets.tenderflexbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tender-flex")
public class LoginController {

    @GetMapping
    public String loginPage() {
        return "Welcome to Tender Flex";
    }
}
