package homework.objectsInMemory;

public class Counter {
    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public void increment() {
        if ((value + step) <= 100){
            value += step;
        }
    }

    public void decrement() {
        if ((value - step) >= 0){
            value -= step;
        }
    }

    public void reset() {
        this.value = 0;
        this.step = 1;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= 100){
            this.value = value;
        }else System.out.println("Entered value is out of range");
    }

    public int getValue() {
        return this.value;
    }

    public void setStep(int step) {
        if (step >= 1 && step <= 10){
            this.step = step;
        } else System.out.println("Entered step is out of range");
    }

    public int getStep() {
        return this.step;
    }
}
