package com.mszgajewski.chatappandroid.messages;

public class MessagesList {

    private final String lastMessage;
    private final String name;
    private final String mobile;
    private final String profilePic;
    private final String chatKey;
    private final int unseenMessages;

    public MessagesList(String name, String mobile, String lastMessage, String profilePic, int unseenMessages, String chatKey) {
        this.lastMessage = lastMessage;
        this.name = name;
        this.mobile = mobile;
        this.unseenMessages = unseenMessages;
        this.profilePic = profilePic;
        this.chatKey = chatKey;
    }

    public String getLastMessage() { return lastMessage; }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getProfilePic() { return profilePic; }

    public String getChatKey() { return chatKey; }

    public int getUnseenMessages() {
        return unseenMessages;
    }
}
