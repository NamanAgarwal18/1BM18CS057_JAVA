package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("Allahabad");
        int choice;
        String branchName,customerName;
        double transaction;
        for(;;)
        {
            choice=printInstructions();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter the Branch name: ");
                    branchName = s.next();
                    if(bank.addBranch(branchName))
                    System.out.println("New Branch Created");
                    break;
                case 2:
                    System.out.print("Enter the Branch name: ");
                    branchName = s.next();
                    System.out.print("Enter the Customer name: ");
                    customerName = s.next();
                    System.out.print("Enter the Transaction: ");
                    transaction = s.nextDouble();
                    if(bank.addCustomer(branchName,customerName,transaction))
                        System.out.println("New Customer Added");
                    break;
                case 3:
                    System.out.print("Enter the Branch name: ");
                    branchName = s.next();
                    System.out.print("Enter the Customer name: ");
                    customerName = s.next();
                    System.out.print("Enter the Transaction: ");
                    transaction = s.nextDouble();
                    if(bank.addtransaction(branchName,customerName,transaction))
                        System.out.println("Transaction Added");
                    break;
                case 4:
                    bank.printBranch();
                    break;
                case 5:
                    System.out.print("Enter the Branch name: ");
                    branchName = s.next();
                    bank.printCustomer(branchName);
                    break;
                case 6:
                    System.out.print("Enter the Branch name: ");
                    branchName = s.next();
                    System.out.print("Enter the Customer name: ");
                    customerName = s.next();
                    bank.printCustomer(branchName,customerName);
                    break;
                case 7:
                    System.out.print("Enter the Branch name: ");
                    branchName = s.next();
                    bank.printTransaction(branchName);
                    break;
                default: return;
            }
        }
    }

    public static int printInstructions()
    {
        System.out.print("\n[1]Create a new Branch" +
                "\n[2]Create a new Customer" +
                "\n[3]Add a Transaction" +
                "\n[4]Show All Branches" +
                "\n[5]Show All Customers for a particular Branch" +
                "\n[6]Show All Transactions for a particular Customer" +
                "\n[7]Show the entire Branch Database" +
                "\n[8]Exit:   ");
        int number = s.nextInt();
        return number;
    }
}
