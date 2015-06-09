import com.tests.MyTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MyTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println("Failure string: " + failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
