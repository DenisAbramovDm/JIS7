package homework.streamAPI;

import homework.streamAPI.model.Product;
import lombok.extern.log4j.Log4j;

import java.util.Comparator;
import java.util.List;

import static homework.streamAPI.service.ProductService.*;
@Log4j
public class Application {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Milk", 2.5, 10),
                new Product("Bread", 3, 5),
                new Product("Hamon", 80, 20),
                new Product("Meat", 13, 32),
                new Product("Cucumber", 2.7, 40),
                new Product("Potato", 2.89, 32),
                new Product("Eggs", 3.4, 40),
                new Product("Apple Juice", 3, 0),
                new Product("Maple", 48, 0),
                new Product("Salmon", 53, 0),
                new Product("Sibas", 33, 0),
                new Product("Chicken", 9.2, 0));

       /* findProductWithDiscount(products);
        findTheMostExpensiveProductWithoutDiscount(products);
        findTheCheapestProductWithTheHighestDiscount(products);*/

        improvedSorting(products);

    }
}
