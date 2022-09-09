import org.testng.annotations.Test;

public class InvocationCount
{
    @Test(priority = 1,invocationCount = 3)
    public void Test1() {
        System.out.println("Test1");
    }
    @Test(invocationCount=4, enabled=false)
    public void editUser(){
        System.out.println("editUser...");
    }
    @Test(invocationCount=4, enabled=true)
    public void editUser1(){
        System.out.println("enabled=true...");
    }
}
