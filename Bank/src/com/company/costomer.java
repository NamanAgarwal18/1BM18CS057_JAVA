package com.company;

import java.util.*;

public class costomer {
    private String name;
    private ArrayList<Double> transaction;

    public costomer(String name, double opening) {
        this.name = name;
        transaction = new ArrayList<Double>();
        transaction.add(opening);
    }

    public void add(double transact) {
        transaction.add(transact);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    @Override
    public String toString() {
        return "costumer {" +
                "name='" + name + '\'' +
                ", transaction=" + transaction.toString() +
                '}';
    }
}
