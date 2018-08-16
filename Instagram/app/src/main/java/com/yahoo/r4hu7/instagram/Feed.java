package com.yahoo.r4hu7.instagram;

public class Feed {
    private String userName;
    private String feedImgUrl;
    private String profileImgUrl;

    private int minutePassed;
    private int likes;

    public int getMinutePassed() {
        return minutePassed;
    }

    public void setMinutePassed(int minutePassed) {
        this.minutePassed = minutePassed;
    }

    public Feed(String userName, String feedImgUrl, String profileImgUrl, int minutePassed, int likes) {
        this.userName = userName;
        this.feedImgUrl = feedImgUrl;
        this.profileImgUrl = profileImgUrl;
        this.minutePassed = minutePassed;
        this.likes = likes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFeedImgUrl() {
        return feedImgUrl;
    }

    public void setFeedImgUrl(String feedImgUrl) {
        this.feedImgUrl = feedImgUrl;
    }

    public String getProfileImgUrl() {
        return profileImgUrl;
    }

    public void setProfileImgUrl(String profileImgUrl) {
        this.profileImgUrl = profileImgUrl;
    }


    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
