package com.aniruddha.hello;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by AniruddhaS on 2/26/2016.
 */
public class HelloTest {
    @Test
    public void itShouldSayHello(){
        //given
        Hello say=new Hello("Hello World");
        //when
        Assert.assertEquals("Hello World",say.sayHello());
        //then
    }
}
