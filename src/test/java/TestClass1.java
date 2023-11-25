import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {


    @BeforeMethod
    public void BM () {
        System.out.println("Before Method");
    }

    @Test(groups = {"Sanity", "Regression"})
    public void TC1() {
        System.out.println("Testcase1 executed");
    }

    @Test(groups = {"Regression"})
    public void TC2() {
        System.out.println("Testcase2 executed");
    }

    @AfterMethod
    public void AM () {
        System.out.println("After Method");
    }


}
