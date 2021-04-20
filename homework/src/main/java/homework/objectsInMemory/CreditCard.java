package homework.objectsInMemory;

import javax.swing.text.MaskFormatter;

public class CreditCard {
    private String cardNumber;
    private String pin;
    private double balance;
    private double creditLimit;
    private double indebtedness;


    public CreditCard(String cardNumber, String pin){
        try{
            MaskFormatter maskForCardNumber = new MaskFormatter("#### #### #### ####");
            maskForCardNumber.setValidCharacters("1234567890");
            MaskFormatter maskForPin = new MaskFormatter("####");
            maskForPin.setValidCharacters("1234567890");
            this.cardNumber = maskForCardNumber.valueToString(cardNumber);
            this.pin = maskForPin.valueToString(pin);
        }catch (Exception ex) {
        }
    }

}
