package homework.methodsAndClasses;

import org.apache.log4j.Logger;

public class Product {
    Logger log = Logger.getLogger(Product.class);
    String name;
    private double regularPrice;
    private double discount;

    public Product(String name){
        this.name = name;
    }

    double actualPrice(){
        return regularPrice - regularPrice * discount / 100;

    }
    void printInformation(){

        log.info(String.format("Product : name = \"%s\"" +
                "%nregular price = %s BYN" +
                "%ndiscount = %s%%" +
                "%nactual price = %.2f BYN", this.name, this.regularPrice, this.discount, this.actualPrice()));

    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
