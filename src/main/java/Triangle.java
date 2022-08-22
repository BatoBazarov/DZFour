
import TriangleException.NegativeNumberException;
import TriangleException.NotTriangleException;
import TriangleException.ZeroSideException;

public class Triangle {
    public double someMethod(double a, double b, double c) throws NotTriangleException, NegativeNumberException, ZeroSideException{

        if (a + b < c || a + c < b || b + c < a) {
            throw new NotTriangleException("Not triangle");
        }

        if (a < 0 || b < 0 || c < 0) {
            throw new NegativeNumberException("Negative number");
        }
        if (a == 0 || b == 0 || c == 0) {
            throw new ZeroSideException("Zero side");
        }

            double pp = (a + b + c) / 2;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
        }
    }

