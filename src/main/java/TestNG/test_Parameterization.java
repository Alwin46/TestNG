package TestNG;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test_Parameterization {

//it is the parameter method in testNG by using testNG xml file

    @Test
    @Parameters({"Name"})
    public void Parameter(String name)
    {
        System.out.println("your name is :"+name);
    }
}
