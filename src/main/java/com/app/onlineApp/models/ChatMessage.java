package com.app.onlineApp.models;


public class ChatMessage {
    private Long id;
    private String sender;
    private String content;

    public Long getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }
}
