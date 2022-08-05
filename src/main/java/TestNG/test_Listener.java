package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class test_Listener implements ITestListener
{
    //it is the listeners for testCases

    @Override
    public void onTestStart(ITestResult result)
    {
        System.out.println("test start");
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("test success");
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        System.out.println("test failure");
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        System.out.println("test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result)
    {
        System.out.println("test failed with success percentage");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result)
    {
        System.out.println("test failed with timeout");
    }

    @Override
    public void onStart(ITestContext context)
    {
        System.out.println("start");
    }

    @Override
    public void onFinish(ITestContext context)
    {
        System.out.println("finish");
    }
}
