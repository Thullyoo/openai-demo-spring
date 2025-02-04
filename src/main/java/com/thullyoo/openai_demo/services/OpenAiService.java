package com.thullyoo.openai_demo.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenAiService {

    @Autowired
    private ChatClient client;

    public String getAnswers(String question){
        return client.prompt()
                .user(question)
                .call()
                .content();
    }
}
