package homework.collections;

import java.math.BigDecimal;

public class ShopDemo {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product banana = new Product("banana", BigDecimal.valueOf(20));
        Product manana = new Product("manana", BigDecimal.valueOf(40));
        Product panama = new Product("panama", BigDecimal.valueOf(120));
        Product rama = new Product("rama", BigDecimal.valueOf(86.64));
        Product mama = new Product("mama", BigDecimal.valueOf(5.8));

        shop.addProduct(banana);
        shop.addProduct(manana);
        shop.addProduct(panama);
        shop.addProduct(rama);
        shop.addProduct(mama);


        System.out.println(shop.findProductsWithPriceRange(BigDecimal.valueOf(50), BigDecimal.valueOf(200)));

    }
}
