package com.thullyoo.openai_demo.controller;

import com.thullyoo.openai_demo.services.OpenAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAIController {

    private final OpenAiService openAiService;

    public OpenAIController(OpenAiService openAiService) {
        this.openAiService = openAiService;
    }

    @GetMapping
    public String getAnswers(@RequestParam(defaultValue = "Liste em ordem cronológica os jogos Resident Evil") String question){
        return openAiService.getAnswers(question);
    }

}
