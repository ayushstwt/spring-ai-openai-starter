package com.ayshriv.spring_ai_test.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    private ChatClient client;

    public AIService(OpenAiChatModel client) {
        this.client = ChatClient.create(client);
    }

    public String ask(String prompt) {
        return client.prompt(prompt)
                .call()
                .content();
    }

}
