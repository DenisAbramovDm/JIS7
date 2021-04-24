package homework.decisions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void updatePriceTest() {
        Stock google = new Stock("GOOG", 10);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        google.printInformation();
    }
}