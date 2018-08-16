package com.yahoo.r4hu7.instagram;

public class Story {

    private String userName;
    private String profileImgUrl;

    public Story(String userName, String profileImgUrl) {
        this.userName = userName;
        this.profileImgUrl = profileImgUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfileImgUrl() {
        return profileImgUrl;
    }

    public void setProfileImgUrl(String profileImgUrl) {
        this.profileImgUrl = profileImgUrl;
    }
}

