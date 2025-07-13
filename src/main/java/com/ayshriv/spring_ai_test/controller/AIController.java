package com.ayshriv.spring_ai_test.controller;

import com.ayshriv.spring_ai_test.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
public class AIController {

    @Autowired
    private  AIService aiService;

    @GetMapping
    public String ask(@RequestParam String prompt) {
        return aiService.ask(prompt);
    }
}
