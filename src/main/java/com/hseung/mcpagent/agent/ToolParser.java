package com.hseung.mcpagent.agent;

import java.util.regex.*;

public class ToolParser {

    private static final Pattern PATTERN = Pattern.compile("@@(.*?)@@");

    public static ParsedTool parse(String input) {
        Matcher matcher = PATTERN.matcher(input);
        if (!matcher.find()) return null;

        String toolName = matcher.group(1).trim();
        String cleanedInput = input.replace(matcher.group(0), "").trim();

        return new ParsedTool(toolName, cleanedInput);
    }
}
