package com.prctisedemo;

public class ProdConfig implements DataConfig{

    @Override
    public void makeConnection() {
        System.out.println("I am the prod config applciation");
    }
}
