
import TriangleException.NotTriangleException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    @DisplayName("Positive test 1, triangle area")
    void test1() throws Exception {
        Triangle triangle = new Triangle();
        System.out.println("This triangle");
        Assertions.assertEquals(6, triangle.someMethod(4, 3, 5));
    }

    @Test
    @DisplayName("Negative test 2, triangle area")
    void test2 () throws Exception {
        Triangle triangle = new Triangle();
        System.out.println("Not triangle");
        Assertions.assertThrows(Exception.class, () -> triangle.someMethod(-5, 6, 8));
    }

    @Test
    @DisplayName("Negative test 3, triangle area")
    void test3 () throws Exception {
        Triangle triangle = new Triangle();
        System.out.println("Negative number");
        Assertions.assertThrows(Exception.class, () -> triangle.someMethod(50, 2, 1));
    }

    @Test
    @DisplayName("Negative test 4, triangle area")
    void test4 () throws Exception {
        Triangle triangle = new Triangle();
        System.out.println("Zero side");
        Assertions.assertThrows(Exception.class, () -> triangle.someMethod(0, 9, 7));
    }
}