package homework.inheritance;

public class DivisionOperation implements MathOperations{
    @Override
    public double compute(double a, double b) {
        return a / b;
    }
}
