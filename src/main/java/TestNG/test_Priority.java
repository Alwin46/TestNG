package TestNG;

import org.testng.annotations.Test;

public class test_Priority {

    /*The testNg testing framework is basically takes the run/compiling is depends on their methods
Alphabet order or number numeric order*/

    //it is also definable by manually with the use of priority method in testNG

    //I define the method A,B,C ,But the actually output is C,B,A Because the priority is defined with index position

    @Test(priority = 2)
    public void A()
    {
        System.out.println("method A");
    }

    @Test(priority = 1)
    public void B()
    {
        System.out.println("method B");
    }

    @Test(priority = 0)
    public void C()
    {
        System.out.println("method C");
    }
}
