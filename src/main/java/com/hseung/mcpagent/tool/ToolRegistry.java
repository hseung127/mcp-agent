package com.hseung.mcpagent.tool;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class ToolRegistry {

    private final Map<String, Tool> tools = new HashMap<>();

    // Spring이 Tool 구현체 전부 주입
    public ToolRegistry(List<Tool> toolList) {
        for (Tool tool : toolList) {
            tools.put(tool.name().toLowerCase(), tool);
        }
    }

    public Set<String> getToolNames() {
        return tools.keySet();
    }

    public Tool get(String name) {
        return tools.get(name.toLowerCase());
    }
}