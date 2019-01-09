package PE4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllTest {
    ReplaceAll obj;
    @Before
    public void setUp() {
        obj = new ReplaceAll();
    }

    @After
public void tearDown(){
    obj = null;
    }

    @Test
    public void checkreplace(){
        String actualstr =obj.replace("derek lee");
        String expectedsr="ferek tee";
        Assert.assertEquals(actualstr,expectedsr);
    }
}
