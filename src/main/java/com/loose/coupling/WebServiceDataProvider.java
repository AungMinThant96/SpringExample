package com.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider{
    @Override
    public String getUserDetail() {
        return "WebServiceDataProvider";
    }
}
