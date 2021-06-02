package homework.collections;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String productName;
    private BigDecimal productPrice;

    public Product(String productName, BigDecimal productPrice) {
        if (!productName.isBlank()) {
            this.productName = productName;
            this.productPrice = productPrice;
        }else {
            this.productName = "default";
            this.productPrice = BigDecimal.ZERO;
        }
    }

    public Product() {

    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName) && Objects.equals(productPrice, product.productPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
