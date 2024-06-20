package com.cirruslink;

import java.util.Map;

public interface ResourceEventHandler {
    void handleEvent(Map<String, Object> resource);
}
