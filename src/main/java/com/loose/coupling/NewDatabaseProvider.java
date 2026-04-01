package com.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserDetail() {
        return "Fetch Data from NewDatabaseProvider";
    }
}
