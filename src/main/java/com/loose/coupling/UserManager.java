package com.loose.coupling;

public class UserManager {
    private UserDataProvider dataProvider;

    public UserManager(UserDataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public String getUserInfo(){
        return this.dataProvider.getUserDetail();
    }
}
