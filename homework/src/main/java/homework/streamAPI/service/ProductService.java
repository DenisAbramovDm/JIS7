package homework.streamAPI.service;

import homework.streamAPI.model.Product;
import lombok.extern.log4j.Log4j;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Log4j
public class ProductService {
    public static void findProductWithDiscount(List<Product> listOfProducts) {
        listOfProducts.stream()
                .filter(p -> p.getDiscount() > 30)
                .filter(p -> p.getPriceWithDiscount() <= 10.5)
                .forEach(log::info);
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
                        .filter(p -> p.getDiscount().equals(maxDiscount))
                        .min(Comparator.comparingDouble(Product::getPriceWithDiscount)).get()

        );

    }

    private static Integer findMaxDiscount(List<Product> listOfProducts) {

        return listOfProducts.stream()
                .map(Product::getDiscount)
                .collect(Collectors.toList())
                .stream()
                .max(Comparator.naturalOrder()).get();

    }

    public static void improvedSorting(List<Product> listOfProducts) {
                listOfProducts.stream()
                        .sorted((o1, o2) -> {
                            if (o1.getPriceWithDiscount() > o2.getPriceWithDiscount()){
                                return 1;
                            }else if (o1.getPriceWithDiscount() < o2.getPriceWithDiscount()){
                                return -1;
                            }return 0;
                        })
                        .sorted((o1, o2) -> {
                            if (o1.getDiscount() == 0 && o2.getDiscount() > 0){
                                return -1;
                            }else if (o1.getDiscount() == 0 && o2.getDiscount() == 0){
                                return 0;
                            }return 1;
                        })
                        .forEach(log::info);
    }
}
