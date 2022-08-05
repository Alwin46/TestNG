package TestNG;

import org.testng.annotations.Test;

public class test_Group {

    //we run the tests by define the group then, we can execute particular groups based on our requirements

    @Test(groups = {"Audi"})
    public void Car1()
    {
        System.out.println("Audi 1");
    }

    @Test(groups ={"Audi"})
    public void Car2()
    {
        System.out.println("Audi 2");
    }

    @Test(groups ={"Bmw"})
    public void Car3()
    {
        System.out.println("Bmw 1");
    }

    @Test(groups ={"Bmw"})
    public void Car4()
    {
        System.out.println("Bmw 2");
    }
}
