package homework.objectsInMemory;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.getValue(); //Equals to 0
        counter.getStep();  //Equals to 1
        counter.increment();
        counter.getValue(); //Equals to 1
        counter.setStep(5);
        counter.increment();
        counter.setStep(2);
        counter.decrement();
        counter.getValue();  //Equals to 4
        counter.getStep();   //Equals to 2
    }


}
