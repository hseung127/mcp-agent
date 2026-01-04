package com.hseung.mcpagent.model;

public class AgentSession {

    private String sessionId;
    private String tool;
    private String input;
    private String result;

    public AgentSession(String sessionId, String tool, String input, String result) {
        this.sessionId = sessionId;
        this.tool = tool;
        this.input = input;
        this.result = result;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getTool() {
        return tool;
    }

    public String getInput() {
        return input;
    }

    public String getResult() {
        return result;
    }
}
