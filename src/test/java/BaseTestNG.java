import org.testng.Reporter;
import org.testng.annotations.*;
@Test
public class BaseTestNG {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }
    @Test
    public void Test1() {
        System.out.println("Test1");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }
    @Test
    public void Test2() {
        System.out.println("Test2");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }

}