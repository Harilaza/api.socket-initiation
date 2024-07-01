package com.harilaza.chat_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatMessage {
    String message;
    String user;
}
