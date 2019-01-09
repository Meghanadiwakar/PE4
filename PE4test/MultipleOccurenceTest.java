package PE4;

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
    @Test
    public void checkoccurence1(){

            List<String> actualresult = obj.findOccurrence("sea sells","se");
//            result.add("She");
//            result.add("sells");
//            result.add("Germany");
//            result.add("Egypt");
//            result.add("czechoslovakia");

            List<String> expectedList = new ArrayList<>();
            expectedList.add("4");
            expectedList.add("-");
            expectedList.add("6");
//            expectedList.add("Egypt");
//            expectedList.add("czechoslovakia");

            Assert.assertNotEquals(expectedList,actualresult);
        }

}