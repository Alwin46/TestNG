package TestNG;

import org.testng.annotations.Test;

public class test_Dependency {


    //it is an example for understand this method

  /*  if we fail the start car method with the use of enabled="false" method
    then the another two methods are doesn't work properly because another two methods are also one by one Dependent*/

    @Test(enabled = true)
    public void startCar()
    {
        System.out.println("start the car with use their key");
    }

    @Test(dependsOnMethods ={"startCar"})
    public void putOnFirstGear()
    {
        System.out.println("put on the first gear manually");
    }

    @Test(dependsOnMethods = {"putOnFirstGear"})
    public void moveTheCar()
    {
        System.out.println("move the car on forward");
    }

}
