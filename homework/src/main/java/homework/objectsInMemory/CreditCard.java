package homework.objectsInMemory;

import javax.swing.text.MaskFormatter;

public class CreditCard {
    private String cardNumber;
    private String pin;
    private double balance;
    private double creditLimit;
    private double indebtedness;

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    private boolean isNumeric(String input){
    try{
        Double.parseDouble(input);
        return true;
    }catch (NumberFormatException e){ return  false;}
}
    public CreditCard(String cardNumber, String pin){
       if (cardNumber.length() == 16 && isNumeric(cardNumber)){
           this.cardNumber = cardNumber;
       } else System.out.println("Illegal card number");
        if (pin.length() == 4 && isNumeric(pin)){
            this.pin = pin;
        } else System.out.println("Illegal pin");
        this.balance = 0;
        this.indebtedness = 0;
    }
    private void printStatus(){
        System.out.printf("Current balance = %s, indebtedness = -%s, credit limit = %s\n", this.balance, this.indebtedness, this.creditLimit);
    }

    private boolean comparePin(String inputPin, String currentPin){
        return inputPin.equals(currentPin);
    }

    public void deposit(String pin, double depositValue){
        if (comparePin(pin, this.pin)){
            if (this.indebtedness == 0){
                this.balance += depositValue;
            } else {
                if (depositValue <= this.indebtedness){
                    this.indebtedness -= depositValue;
                }else {
                    this.balance += depositValue - this.indebtedness;
                    this.indebtedness = 0;
                }

            } printStatus();
        }else System.out.println("Incorrect pin\n");
    }

    public void withdraw(String pin, double withdrawValue){
        if (comparePin(pin, this.pin)){
            if (withdrawValue <= this.balance){
                this.balance -= withdrawValue;
            }else {
                if (this.indebtedness + (withdrawValue - this.balance) > this.creditLimit){
                    System.out.println("You are out of range of credit limit");
                }else {
                    this.indebtedness += (withdrawValue - this.balance);
                    this.balance = 0;
                }
            }
           printStatus();
        }else System.out.println("Incorrect pin");
    }

}
