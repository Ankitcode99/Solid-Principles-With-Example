package org.example.AnkitCode99.LiskovSubstitution.GoodDesign;

public class BookDelivery {
    String title;
    Integer userId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
