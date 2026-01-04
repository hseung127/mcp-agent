package com.hseung.mcpagent.service;

import com.hseung.mcpagent.model.AgentSession;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class SessionStore {

    private final Map<String, AgentSession> store = new ConcurrentHashMap<>();

    public void save(AgentSession session) {
        store.put(session.getSessionId(), session);
    }

    public AgentSession get(String id) {
        return store.get(id);
    }
}