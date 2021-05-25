package com.company;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String branchName;

    public Branch(String branchName) {
        this.customers = new ArrayList<Customer>();
        this.branchName = branchName;
    }

    public boolean addCustomer(String name, Double transaction)
    {
        if(findCustomer(name)!=-1)
            return false;
        customers.add(Customer.newCustomer(name,transaction));
        return true;
    }

    private int findCustomer(String name)
    {
        for(int i=0; i< customers.size(); i++ )
        {
            if(name.equals(customers.get(i).getName()))
            {
                return i;
            }
        }
        return -1;
    }

    public boolean addTransaction(String name, double transaction)
    {
        int temp = findCustomer(name);
        if(temp==-1)
            return false;
        customers.get(temp).add(transaction);
        return true;
    }

    public String getBranchName() {
        return branchName;
    }

    public static Branch newBranch(String name)
    {
        return new Branch(name);
    }

    public void printCustomer()
    {
        for(int i=0; i<customers.size(); i++)
            System.out.println((i+1) + " > " + customers.get(i).getName());
    }

    public void printTransaction()
    {
        for(int i=0; i<customers.size(); i++)
        {
            System.out.println((i+1) + " > " + customers.get(i).getName());
            customers.get(i).printTransaction();
        }
    }

    public boolean printTransaction(String name)
    {
        int temp = findCustomer(name);
        if(temp==-1)
            return false;
        customers.get(temp).printTransaction();
        return true;
    }
}
