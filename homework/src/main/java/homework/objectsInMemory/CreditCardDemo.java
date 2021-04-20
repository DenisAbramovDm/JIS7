package homework.objectsInMemory;

public class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard("1234657812369846", "1234");
        myCard.setCreditLimit(500);
        myCard.deposit("1234", 150);
        myCard.withdraw("1234", 50);
        myCard.deposit("4444", 500);
        myCard.withdraw("4444", 500);
        myCard.withdraw("1234", 5000);
        myCard.setCreditLimit(7500);
        myCard.withdraw("1234", 5000);
    }
}
