package com.cirruslink;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONEncodingEventHandler implements ResourceEventHandler {
    private ObjectMapper objectMapper;

    public JSONEncodingEventHandler() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public void handleEvent(Map<String, Object> resource) {
        try {
            String json = objectMapper.writeValueAsString(resource);
            System.out.println("JSON Encoding Handler - Encoded event: " + json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
