package com.example.misbahulardani.helloworldmvp;

/**
 * Created by Misbahul Ardani on 5/21/2018.
 */

public class MainModel implements MainContract.Model {
    @Override
    public String getData() {
        return "Hello world!";
    }
}
