/*Write a program to transpose the given string.
 */

package com.stackroute.PE4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString obj;
    @Before
    public void setUp(){
        obj = new TransposeString();


    }

    @After
    public void tearDown(){
        obj = null;
    }
//test for success//
    @Test
    public void checktranspose(){
        String actualstr = obj.reverseMyString("this is me");
        String expectedstr="siht si em";
        Assert.assertEquals(expectedstr,actualstr);
    }
//test for failure//
    @Test
    public void checktransposefailure(){
        String actualstr = obj.reverseMyString("this is me");
        String expectedstr="siht si em";
        Assert.assertNotEquals(expectedstr,actualstr);
    }
//test for null//
    @Test
    public void checktransposenull(){
        String actualstr = obj.reverseMyString("");
        String expectedstr=null;
        Assert.assertEquals(expectedstr,actualstr);
    }


}