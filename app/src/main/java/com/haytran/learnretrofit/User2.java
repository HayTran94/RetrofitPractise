package com.haytran.learnretrofit;

import com.google.gson.annotations.SerializedName;

public class User2 {

    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;

    public String birthday = "now";

    public User2(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", id='" + id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
