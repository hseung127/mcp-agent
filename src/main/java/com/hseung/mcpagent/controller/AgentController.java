package com.hseung.mcpagent.controller;

import com.hseung.mcpagent.service.AgentService;
import org.springframework.web.bind.annotation.*;
import com.hseung.mcpagent.model.AgentSession;

@RestController
@RequestMapping("/api/agent")
public class AgentController {

    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @PostMapping("/chat")
    public AgentSession chat(
            @RequestParam String model,
            @RequestBody String input
    ) {
        return agentService.run(model, input);
    }

}