package PE4;

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

    @Test
    public void Checkoccurence()
    {
        int actualstr =obj.count("this is me",'e');
        int expectedstr = 1;
        Assert.assertEquals(actualstr, expectedstr);
    }

}