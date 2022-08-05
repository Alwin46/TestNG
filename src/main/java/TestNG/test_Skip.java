package TestNG;

import org.testng.annotations.Test;

public class test_Skip {

    //if you want to skip any test,use the enabled "true/false" method

    @Test(enabled = false)
    public void Method1()
    {
        System.out.println("first method");
    }

    @Test(enabled = true)
    public void Method2()
    {
        System.out.println("second method");
    }

    @Test(enabled = true)
    public void Method3()
    {
        System.out.println("third method");
    }
}
