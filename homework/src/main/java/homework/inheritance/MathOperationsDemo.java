package homework.inheritance;

public class MathOperationsDemo {
    public static void main(String[] args) {
        OperationExecutor executor = new OperationExecutor();
        MathOperations[] ops = {new AdditionOperation(),
                new DivisionOperation(),
                new MultiplicationOpperation(),
                new SubtractionOperation()};
        executor.execute(ops, 5, 3);
    }


}
