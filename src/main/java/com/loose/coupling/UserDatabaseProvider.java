package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetail() {
        return "UserDatabaseProvider";
    }
}
