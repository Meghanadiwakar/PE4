/*Write a program that sets up a String variable
*  containing a paragraph of text of your choice.
 a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.
*/

package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabeticalSortTest {
    AlphabeticalSort sortWords=new AlphabeticalSort();
    @Before
    public void setUp()
    {
        sortWords=new AlphabeticalSort();
    }
    @After
    public void tearDown()
    {
        sortWords=null;
    }
//test for success//
    @Test
    public void testSortWordsSuccess()
    {
        String originalString="Hey This is me";
        String actualValue=sortWords.wordSortingMethod(originalString);
        String expectedValue="eHy hisT is em";
        assertEquals(expectedValue,actualValue);

    }
//test for failure//
    @Test
    public void testSortWordsFailure()
    {

        String originalString="Hey This is me";
        String actualValue=sortWords.wordSortingMethod(originalString);
        String expectedValue="eHy hisT is me";
        assertNotEquals(expectedValue,actualValue);

    }
//test for null//
    @Test
    public void testSortWordsNeutral()
    {

        String originalString=null;
        String actualValue=sortWords.wordSortingMethod(originalString);
        String expectedValue=null;
        assertEquals(expectedValue,actualValue);


        originalString="";
        actualValue=sortWords.wordSortingMethod(originalString);
        assertNotNull(actualValue);

    }


}


