package com.hseung.mcpagent.tool.echo;

import com.hseung.mcpagent.tool.Tool;
import org.springframework.stereotype.Component;

@Component
public class EchoTool implements Tool {

    @Override
    public String name() {
        return "echo";
    }

    @Override
    public String description() {
        return "테스트용 도구";
    }

    @Override
    public String execute(String input) {
        return "ECHO: " + input;
    }
}