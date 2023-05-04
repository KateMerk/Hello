package part1.Task34;

import java.util.Random;

public  class Card {
    private int balance;
    private  String id;
    private String name;

    public Card(int balance, String id, String name) {
        this.balance = balance;
        this.id = id;
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shouBalance(int balance){
        System.out.println("Yours balance is "+ balance);
    }



}
