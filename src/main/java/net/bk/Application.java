package net.bk;

import java.util.Random;

public class Application {
    private String userToken;

    public void Login(){
        // some logic
        this.userToken = "fsjl;akjf;lkj";

    }

    public String getUserToken() {
        return userToken;
    }

    public Application setUserToken(String userToken) {
        this.userToken = userToken;
        return this;
    }




}
