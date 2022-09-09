import org.testng.annotations.Test;

public class Grouping
{
    @Test(groups = "kanak")
    public void Test2() {
        System.out.println("Test2");
    }
    @Test(groups = "kanak")
    public void Test1() {
        System.out.println("Test1");
    }
    @Test
    public void Test3() {
        System.out.println("Test3");
    }
}
