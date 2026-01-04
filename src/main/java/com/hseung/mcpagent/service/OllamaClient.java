package com.hseung.mcpagent.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class OllamaClient {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String URL = "http://localhost:11434/api/generate";

    public String chat(String model, String prompt) {
        Map<String, Object> body = Map.of(
                "model", model,
                "prompt", prompt,
                "stream", false
        );

        Map response = restTemplate.postForObject(URL, body, Map.class);
        return response.get("response").toString();
    }
}