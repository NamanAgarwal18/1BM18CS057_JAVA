package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        multigen <Integer,Character> m1 = new multigen<Integer, Character>(10,'+');
        multigen<String, Boolean> m2 = new multigen<String, Boolean>("hi",true);
        int c1 = m1.returntype1();
        char x1 = m1.returntype2();
        System.out.println(c1 + " " + x1);
        String c2 = m2.returntype1();
        boolean x2 = m2.returntype2();
        System.out.println(c2 + " " + x2);
        m1.display();
        m2.display();
    }
}



class multigen <t1,t2>
{
    t1 a;
    t2 b;

    multigen(t1 a, t2  b)
    {
        this.a = a;
        this.b = b;
    }
    t1 returntype1()
    {
        return a;
    }

    t2 returntype2()
    {
        return b;
    }

    void display()
    {
        System.out.println(a + " " + b);
    }

}
