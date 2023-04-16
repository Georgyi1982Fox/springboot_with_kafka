package com.it.jet.common.processor;

import com.it.jet.common.messages.Message;
public interface MessageProcessor <T extends Message> {
    void process(String jsonMessage);
}
