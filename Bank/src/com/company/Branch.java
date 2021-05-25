package com.company;
import java.util.*;
public class Branch {
    ArrayList<costomer> Costomer;
    String name;
    Scanner s = new Scanner(System.in);

    public Branch(String name) {
        this.name = name;
        Costomer = new ArrayList<costomer>();
    }

    public void addCostomer()
    {
        System.out.print("Enter The Name Of The Costomer: ");
        String name = s.next();
        if(findid(name)<0)
        {
            System.out.println("Costomer Already exists");
            return;
        }
        costomer temp = new costomer(name,1000.0);
        Costomer.add(temp);
        System.out.println("New Costomer Successfully Added");
    }

    private int findid(String name)
    {
        for(int i=0; i<Costomer.size(); i++)
        {
            if(name.equals(Costomer.get(i).getName()))
                return i;
        }
        return -1;
    }

    public void display(String name)
    {
        int pos = findid(name);
        if(pos<0)
        {
            System.out.println("The Customer doesn't exist");
            return;
        }
        System.out.println(Costomer.get(pos).toString());
    }

    public void displayAll()
    {
        for(costomer temp : Costomer)
        {
            System.out.println(temp.toString());
        }
    }

    public void addteansact()
    {
        System.out.println("Enter the name of the Customer: ");
        String name = s.next();
        int pos = findid(name);
        if(pos<0)
        {
            System.out.println("No Such Customer exist");
            return;
        }
        System.out.println("enter the latest transaction: ");
        double trans = s.nextDouble();
        Costomer.get(pos).add(trans);
        System.out.println("Successfully added");
    }

   
    public void menu()
    {
        int choice;
        for(;;)
        {
            System.out.println("[1]Add a Costomer " +
                    "\n[2]Display a particular customer " +
                    "\n[3]Display All" +
                    "\n[4]Add a transaction" +
                    "\n[5]Quit");
            choice = s.nextInt();
            switch (choice)
            {
                case 1: addCostomer();
                        break;
                case 2:
                    System.out.println("Enter the name of the customer: ");
                    String name = s.next();
                    display(name);
                    break;
                case 3: displayAll();
                        break;
                case 4: addteansact();
                        break;
                default: return;
            }
        }
    }


}
