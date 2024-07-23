package com.codingvishalrai.springBoot;

public class DevDB implements DB {
    public String getDevDB(){
        return " Dev Data";
    }

    @Override
    public String getData() {
        return null;
    }
}
