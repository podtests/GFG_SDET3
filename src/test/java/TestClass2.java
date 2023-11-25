import org.testng.annotations.*;

public class TestClass2 {


    @BeforeTest
    public void BT() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void BC() {
        System.out.println("Before Class2");
    }

    @Test(groups = {"Sanity"})
    public void TC3() {
        System.out.println("Testcase3 executed");
    }

    @Test
    public void TC4() {
        System.out.println("Testcase4 executed");
    }

    @AfterClass
    public void AC() {
        System.out.println("After Class2");
    }

    @AfterTest
    public void AT() {
        System.out.println("After Test");
    }


}
