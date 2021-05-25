package com.company;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Branch> branch;

    public Bank(String name) {
        this.name = name;
        branch = new ArrayList<>();
    }

    public void addBranch(String name)
    {
        branch.add(new Branch(name));
    }

    private int findbran(String name)
    {
        for(int i=0; i<branch.size(); i++)
        {
            if(name.equals(branch.get(i).name))
                return i;
        }
        return -1;
    }

    public void displayAll()
    {

    }
}
