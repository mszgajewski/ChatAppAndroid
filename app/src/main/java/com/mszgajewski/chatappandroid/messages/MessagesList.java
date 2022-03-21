package com.mszgajewski.chatappandroid.messages;

public class MessagesList {

    private String lastMessage;
    private String name;
    private String mobile;
    private String profilePic;
    private int unseenMessages;

    public String getProfilePic() {
        return profilePic;
    }

    public MessagesList(String profilePic, String lastMessage, String name, String mobile, int unseenMessages) {
        this.lastMessage = lastMessage;
        this.name = name;
        this.mobile = mobile;
        this.unseenMessages = unseenMessages;
        this.profilePic = profilePic;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public int getUnseenMessages() {
        return unseenMessages;
    }
}
