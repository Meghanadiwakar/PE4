/*Write a program with the implementation of Regular Expression
 * to find the presence of the name Harry in a string.
 */

package com.stackroute.PE4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegularExpressionTest {
    RegularExpression obj;
    @Before
    public  void setUp()
    {
        obj = new RegularExpression();

    }
    @After
    public void tearDown()
    {

        obj=null;
    }
//test for success//
    @Test
    public void checkregex(){
        boolean actualstr = obj.checkPresence("this is Harry");
        boolean expectedstr = true;
        Assert.assertEquals(actualstr,expectedstr);
    }
//test for failure//
    @Test
    public void checkregexfailure(){
        boolean actualstr = obj.checkPresence(" barry");
        boolean expectedstr = true;
        Assert.assertNotEquals(actualstr,expectedstr);
    }

//test for null//
    @Test
    public void checkregexnull(){
        boolean actualstr = obj.checkPresence("");
        boolean expectedstr = false;
        Assert.assertEquals(actualstr,expectedstr);
    }

}