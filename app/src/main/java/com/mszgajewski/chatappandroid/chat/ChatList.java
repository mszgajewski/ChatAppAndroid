package com.mszgajewski.chatappandroid.chat;

public class ChatList {

    private final String mobile;
    private final String name;
    private final String message;
    private final String date;
    private final String time;

    public ChatList(String mobile, String name, String message, String date, String time) {
        this.mobile = mobile;
        this.name = name;
        this.message = message;
        this.date = date;
        this.time = time;
    }

    public String getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
