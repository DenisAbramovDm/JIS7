package homework.hospital.model;

import lombok.extern.slf4j.XSlf4j;

import java.util.List;

public class User {
    private final String userName;
    private final String name;
    private int quantityOfPayedVisits;
    private List<Record> records;

    public User(String username, String name) {
        this.userName = username;
        this.name = name;
        this.quantityOfPayedVisits = 0;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void addRecord(Record record) {
        this.records.add(record);
    }

    public String getName(){
        return this.name;
    }

    public String getUserName() {
        return userName;
    }

    public int getQuantityOfPayedVisits(){
        return this.quantityOfPayedVisits;
    }
    public void increaseQuantityOfPayedVisits(int quantityForIncrease){
        this.quantityOfPayedVisits =+ quantityForIncrease;
    }
    public void decrementQuantityOfPayedVisits(){
        this.quantityOfPayedVisits --;
    }
}
