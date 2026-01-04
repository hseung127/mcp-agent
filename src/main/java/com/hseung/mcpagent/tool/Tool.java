package com.hseung.mcpagent.tool;

public interface Tool {

    String name();
    String description();
    String execute(String input);
}