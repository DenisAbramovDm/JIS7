package homework.decisions;

public class Stock {
    private String nameCompany;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String name, int price){
        this.nameCompany = name;
        this.currentPrice = price;
        this.maxPrice = price;
        this.minPrice = price;
    }

    public void printInformation(){
        System.out.println("Company = \"" + this.nameCompany + "\", Current Price = " +
                this.currentPrice + ", Min Price = " + this.minPrice + ", Max Price = " + this.maxPrice);

    }

    public void updatePrice(int value){
        this.currentPrice = value;
        if (this.maxPrice < value)
            this.maxPrice = value;
        if (this.minPrice > value)
            this.minPrice = value;
    }
}
