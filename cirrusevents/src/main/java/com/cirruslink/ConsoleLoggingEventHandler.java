package com.cirruslink;

import java.util.Map;

public class ConsoleLoggingEventHandler implements ResourceEventHandler {
    @Override
    public void handleEvent(Map<String, Object> resource) {
        System.out.println("Console Logging Handler - Received event: " + resource);
    }
}
