package homework.inheritance;

public class AdditionOperation implements MathOperations {
    @Override
    public double compute(double a, double b) {
        return a + b;
    }
}
