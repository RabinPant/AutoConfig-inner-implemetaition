package com.prctisedemo;

public class DevConfig implements DataConfig{

    @Override
    public void makeConnection() {

        System.out.println("I am the DEV config::");
    }
}
