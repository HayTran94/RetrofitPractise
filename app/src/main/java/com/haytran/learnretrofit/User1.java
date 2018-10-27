package com.haytran.learnretrofit;

import com.google.gson.annotations.SerializedName;

public class User1 {

    @SerializedName("id")
    public Integer id;
    @SerializedName("first_name")
    public String first_name;
    @SerializedName("last_name")
    public String last_name;
    @SerializedName("avatar")
    public String avatar;

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}