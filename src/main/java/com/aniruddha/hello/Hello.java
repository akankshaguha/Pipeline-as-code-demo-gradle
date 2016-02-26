package com.aniruddha.hello;

/**
 * Created by AniruddhaS on 2/26/2016.
 */
public class Hello {
    private final String sayStatement;
    public Hello(String s) {
        this.sayStatement=s;
    }

    public String sayHello() {
        return this.sayStatement;
    }
}
