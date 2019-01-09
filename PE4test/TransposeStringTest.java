package PE4;

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

    @Test
    public void checktranspose(){
        String actualstr = obj.reverseMyString("this is me");
        String expectedstr="siht si em";
        Assert.assertEquals(expectedstr,actualstr);
    }


}