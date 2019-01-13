/*Write a program to find out the multiple occurrences of
 * the given word in a string using Matcher methods*/

package com.stackroute.PE4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MultipleOccurenceTest {
    MultipleOccurence obj;

    @Before
    public void setUp(){
        obj = new MultipleOccurence();

    }
    @After
    public void tearDown(){
        obj = null;

    }

//test for success//
    @Test
    public void checkoccurence1(){

        List<String> actualresult = obj.findOccurrence("sea sells","se");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("0");
        expectedList.add("-");
        expectedList.add("2");
        expectedList.add("4");
        expectedList.add("-");
        expectedList.add("6");

        Assert.assertEquals(expectedList,actualresult);
    }

//test for failure//
    @Test
    public void checkoccurencefailure(){

        List<String> actualresult = obj.findOccurrence("sea sells","se");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("4");
        expectedList.add("-");
        expectedList.add("6");
        Assert.assertNotEquals(expectedList,actualresult);
    }

//test for null//
    @Test
    public void checkoccurence0(){

        List<String> actualresult = obj.findOccurrence("","");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("invalid");
        Assert.assertNotEquals(expectedList,actualresult);
    }

}

