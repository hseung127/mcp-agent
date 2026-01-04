package com.hseung.mcpagent.service;

import com.hseung.mcpagent.agent.ParsedTool;
import com.hseung.mcpagent.agent.ToolParser;
import com.hseung.mcpagent.model.AgentSession;
import com.hseung.mcpagent.tool.Tool;
import com.hseung.mcpagent.tool.ToolRegistry;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service

public class AgentService {

    private final ToolRegistry registry;
    private final OllamaClient ollama;
    private final SessionStore store;

    public AgentService(ToolRegistry registry, OllamaClient ollama, SessionStore store) {
        this.registry = registry;
        this.ollama = ollama;
        this.store = store;
    }

    public AgentSession run(String model, String userInput) {

        // @@tool@@ 파싱
        ParsedTool parsed = ToolParser.parse(userInput);

        String selectedTool = "none";
        String cleanedInput = userInput;
        String result;

        if (parsed != null) {
            selectedTool = parsed.tool();
            cleanedInput = parsed.input();

            Tool tool = registry.get(selectedTool);
            if (tool == null) {
                result = "Unknown tool: " + selectedTool;
            } else {
                // Tool 실행
                result = tool.execute(cleanedInput);
            }

        } else {
            // Tool 없으면 그냥 LLM
            result = ollama.chat(model, userInput);
        }

        // JSON(Session) 생성
        AgentSession session = new AgentSession(
                UUID.randomUUID().toString(),
                selectedTool,
                cleanedInput,
                result
        );

        // 저장
        store.save(session);

        return session;
    }
}
