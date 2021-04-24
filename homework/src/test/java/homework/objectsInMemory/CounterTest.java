package homework.objectsInMemory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {



    @Test
    void increment() {
        Counter counter = new Counter();
        int step = 5;
        counter.setStep(step);
        counter.increment();
        assertEquals(5, counter.getValue());
    }

    @Test
    void decrement() {
        Counter counter = new Counter();
        int step = 5;
        counter.setValue(10);
        counter.setStep(step);
        counter.decrement();
        assertEquals(5, counter.getValue());
    }

    @Test
    void reset() {
        Counter counter = new Counter();
        counter.setValue(10);
        counter.reset();
        assertEquals(0, counter.getValue());
    }

    @Test
    void setValue() {
        Counter counter = new Counter();
        int value = 10;
        counter.setValue(value);
        assertEquals(value, counter.getValue());
    }

    @Test
    void setStep() {
        Counter counter = new Counter();
        int step = 5;
        counter.setStep(step);
        assertEquals(step, counter.getStep());
    }
}