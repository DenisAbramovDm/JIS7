package homework.streamAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private double price;
    private Integer discount;
    private double priceWithDiscount;

    public Product(String name, double price, Integer discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        priceWithDiscount = price - (price * discount / 100);
    }
}
