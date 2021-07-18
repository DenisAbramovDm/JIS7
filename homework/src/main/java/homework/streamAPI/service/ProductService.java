package homework.streamAPI.service;

import homework.streamAPI.model.Product;
import lombok.extern.log4j.Log4j;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Log4j
public class ProductService {
    public static void findProductWithDiscount(List<Product> listOfProducts){
        listOfProducts.stream()
                .filter(p-> p.getDiscount() > 30)
                .filter(p->p.getPriceWithDiscount() <= 10.5)
                .forEach(product -> log.info(product));
    }

    public static void findTheMostExpensiveProductWithoutDiscount(List<Product> listOfProducts){
        log.info(listOfProducts.stream()
                .filter(product -> product.getDiscount() == 0)
                .max(Comparator.comparingDouble(Product::getPrice)));
    }

    public static void findTheCheapestProductWithTheHighestDiscount(List<Product> listOfProducts){

    }

}
