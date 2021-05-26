package test;
import org.testng.TestNG;

public class testRunner {
    public static void main(String[] args) {
        TestNG testSuite = new TestNG();
        testSuite.setTestClasses(new Class[] { usedCarWebUITest.class });
        testSuite.run();
    }
}
