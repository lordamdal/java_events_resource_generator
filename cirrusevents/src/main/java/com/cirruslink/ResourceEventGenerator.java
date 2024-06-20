package com.cirruslink;

import java.util.*;
import java.util.concurrent.*;

public class ResourceEventGenerator {
    private List<ResourceEventHandler> eventHandlers;
    private Random random;

    public ResourceEventGenerator() {
        this.eventHandlers = new ArrayList<>();
        this.random = new Random();
    }

    public void addEventHandler(ResourceEventHandler handler) {
        eventHandlers.add(handler);
    }

    public void startGeneratingEvents() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(() -> {
            Map<String, Object> resource = generateRandomResource();
            notifyHandlers(resource);
        }, 0, 1, TimeUnit.SECONDS); // Generate every second

        // Shutdown executor after 10 seconds for demonstration purposes
        executor.schedule(() -> {
            executor.shutdown();
        }, 10, TimeUnit.SECONDS);
    }

    private Map<String, Object> generateRandomResource() {
        Map<String, Object> resource = new HashMap<>();
        resource.put("name", "TestResource");
        resource.put("timestamp", new Date());
        resource.put("datatype", "int");
        resource.put("value", random.nextInt(100)); // Random integer value
        return resource;
    }

    private void notifyHandlers(Map<String, Object> resource) {
        for (ResourceEventHandler handler : eventHandlers) {
            handler.handleEvent(resource);
        }
    }

    public static void main(String[] args) {
        ResourceEventGenerator generator = new ResourceEventGenerator();

        // Example: Add handlers
        generator.addEventHandler(new ConsoleLoggingEventHandler());
        generator.addEventHandler(new JSONEncodingEventHandler());

        // Start generating events
        generator.startGeneratingEvents();
    }
}
