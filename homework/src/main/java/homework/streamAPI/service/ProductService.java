package homework.streamAPI.service;

import homework.streamAPI.model.Product;
import lombok.extern.log4j.Log4j;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Log4j
public class ProductService {
    public static void findProductWithDiscount(List<Product> listOfProducts) {
        listOfProducts.stream()
                .filter(p -> p.getDiscount() > 30)
                .filter(p -> p.getPriceWithDiscount() <= 10.5)
                .forEach(product -> log.info(product));
    }

    public static void findTheMostExpensiveProductWithoutDiscount(List<Product> listOfProducts) {
        log.info("The Most Expensive Product Without Discount is: " + listOfProducts.stream()
                .filter(product -> product.getDiscount() == 0)
                .max(Comparator.comparingDouble(Product::getPrice)).get());
    }

    public static void findTheCheapestProductWithTheHighestDiscount(List<Product> listOfProducts) {
        Integer maxDiscount = findMaxDiscount(listOfProducts);
        log.info("The biggest discount is: " + maxDiscount + "%");
        log.info("The Cheapest Product With The Highest Discount is: " +
                listOfProducts.stream()
                        .filter(p -> p.getDiscount() == maxDiscount)
                        .min(Comparator.comparingDouble(Product::getPriceWithDiscount)).get()

        );

    }

    private static Integer findMaxDiscount(List<Product> listOfProducts) {

        return listOfProducts.stream()
                .map(product -> product.getDiscount())
                .collect(Collectors.toList())
                .stream()
                .max(Comparator.naturalOrder()).get();

    }


}
