package PE4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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

@Test
    public void checkregex(){
        boolean actualstr = obj.checkPresence("this is Harry");
        boolean expectedstr = true;
    Assert.assertEquals(actualstr,expectedstr);
}

}