package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test_AssertEquals {

    /*
    it is another way of conditional statement ,validate/verify our data
    if I define something wrong like "alwin" ,then output is : Expected :alwin
                                                               Actual   :Alwin*/
    String name="Alwin";

    @Test
    public void Assert()
    {
        Assert.assertEquals(name,"Alwin");
    }
}
