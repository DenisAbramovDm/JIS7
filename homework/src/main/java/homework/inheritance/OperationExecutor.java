package homework.inheritance;

public class OperationExecutor {
    void execute(MathOperations[] operations,double a, double b){
        for (int i = 0; i < operations.length; i++){
            System.out.println(operations[i].getClass() + "___________"
                    + operations[i].compute(a, b));
        }
    }
}
