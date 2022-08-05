package TestNG;

import org.testng.annotations.*;

public class test_AnnotationOrder
{

    //it is the annotation order by execute

    @BeforeSuite
    public void method1()
    {
        System.out.println("before suite");
    }


    @BeforeTest
    public void method2()
    {
        System.out.println("before test");
    }

    @BeforeMethod
    public void method3()
    {
        System.out.println("before method");
    }

    @Test
    public void method4()
    {
        System.out.println("test1");
    }

    @Test
    public void method5()
    {
        System.out.println("test2");
    }

    @AfterMethod
    public void method6()
    {
        System.out.println("after method");
    }

    @AfterTest
    public void method7()
    {
        System.out.println("after test");
    }

    @AfterSuite
    public void method8()
    {
        System.out.println("after suite");
    }


    //OutPut:

    /*
before suite

before test

before method

test1

after method

before method

test2

after method

after test

after suite
    */
}
