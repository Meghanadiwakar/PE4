/*Write a program to find out the multiple occurrences
of the given word in a string using Matcher methods.
 */


package com.stackroute.PE4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringOccurenceTest {
    StringOccurence obj;
    @Before
    public void setUp()
    {
        obj = new StringOccurence();
    }

    @After
    public void tearDown()
    {
        obj= null;

    }
//test for success//
    @Test
    public void Checkoccurence()
    {
        int actualstr =obj.count("this is me",'e');
        int expectedstr = 1;
        Assert.assertEquals(actualstr, expectedstr);
    }
//test for failure//
    @Test
    public void Checkoccurencefailure()
    {
        int actualstr =obj.count("this is me",'a');
        int expectedstr = 1;
        Assert.assertNotEquals(actualstr, expectedstr);
    }
//test for null//
    @Test
    public void Checkoccurencenull()
    {
        int actualstr =obj.count("",'e');
        int expectedstr = 0;
        Assert.assertEquals(actualstr, expectedstr);
    }

}