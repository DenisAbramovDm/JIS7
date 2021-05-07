package homework.methodsAndClasses;

public class ProductDemo {
    public static void main(String[] args) {
        Product milk = new Product("Milk");
        milk.setRegularPrice(2.34);
        milk.setDiscount(20);
        milk.printInformation();
    }


}
