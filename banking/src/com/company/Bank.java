package com.company;

import java.util.ArrayList;


public class Bank {
    private ArrayList<Branch> branch;
    private String bankName;

    public Bank(String bankName) {
        this.branch = new ArrayList<Branch>();
        this.bankName = bankName;
    }
    private int findBranch(String name)
    {

        for(int i=0; i<branch.size(); i++)
        {
            if(name.equals(branch.get(i).getBranchName()))
                return i;
        }
        return -1;
    }
    public boolean addBranch(String name)
    {
        if(findBranch(name)!=-1)
        {
            System.out.println("Branch already exists");
            return false;
        }
        branch.add(Branch.newBranch(name));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction)
    {
        int temp = findBranch(branchName);
        if(temp==-1) {
            System.out.println("Branch doesn't exist");
            return false;
        }
        if(branch.get(temp).addCustomer(customerName,transaction))
        return true;
        System.out.println("Customer doesn't exist");
        return false;
    }

    public boolean addtransaction(String branchName, String customerName, double transaction)
    {
        int temp = findBranch(branchName);
        if(temp==-1) {
            System.out.println("Branch doesn't exist");
            return false;
        }
        if(branch.get(temp).addTransaction(customerName,transaction))
            return true;
        System.out.println("Customer doesn't exist");
        return false;
    }

    public void printBranch()
    {
        for(int i=0; i<branch.size(); i++)
            System.out.println((i+1) + " > " + branch.get(i).getBranchName());
    }

    public void printCustomer(String name)
    {
        int temp = findBranch(name);
        if(temp==-1)
        {
            System.out.println("Branch not found");
            return;
        }
        branch.get(temp).printCustomer();

    }

    public void printCustomer(String branchName, String customerName)
    {
        int temp = findBranch(branchName);
        if(temp==-1)
        {
            System.out.println("Branch not found");
            return;
        }
        if(branch.get(temp).printTransaction(customerName))
            return;
        System.out.println("Customer not found");

    }

    public void printTransaction(String name)
    {
        int temp = findBranch(name);
        if(temp==-1)
        {
            System.out.println("Branch not found");
            return;
        }
        branch.get(temp).printTransaction();

    }

}
