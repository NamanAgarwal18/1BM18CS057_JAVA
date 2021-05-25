package com.company;

import java.util.ArrayList;

 class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transactions) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(transactions);
    }

    public String getName() {
        return name;
    }

    public double get(int position) {
        return transactions.get(position);
    }

    public void add(double transactions) {
        this.transactions.add(transactions);
    }

    public static Customer newCustomer(String name, double transactions)
    {
        return new Customer(name,transactions);
    }

    public void printTransaction()
    {
        for(int i=0; i<transactions.size(); i++)
            System.out.println((i+1) + " > " + transactions.get(i));
    }
}
