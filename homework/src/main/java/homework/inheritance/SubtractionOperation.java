package homework.inheritance;

public class SubtractionOperation implements MathOperations{

    @Override
    public double compute(double a, double b) {
        return a - b;
    }
}
