import java.util.Scanner;

public class Main {

    private static MobilePhones array = new MobilePhones();
    private static Scanner s = new Scanner(System.in);

    public static void main(String args[])
    {
        int number;
        for(;;)
        {
            print();
            number = s.nextInt();
            switch (number)
            {
                case 0: array.print();
                    break;
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    modify();
                    break;
                default:
                    return;

            }
        }
    }

    public static void print()
    {
        System.out.print("[0]To Show All The Contacts \n[1]To Add A New Contact \n[2}To Remove A Contact\n[3]To Modify A Contact \n[4]Exit: ");
    }

    public static void add()
    {
        System.out.print("Enter The Name: ");
        String name = s.next();
        System.out.print("Enter the Number: ");
        long number = s.nextLong();
        array.addnew(number,name);
        System.out.println("New Contact Added");
    }

    public static void remove()
    {
        System.out.print("Enter The Name Of Contact To Be Removed: ");
        String name = s.next();
        if(array.removeOld(name));
        {
            System.out.println("Contact Removed");
        }
    }

    public static void modify()
    {
        System.out.print("Enter The Name Of Contact To Be Modified: ");
        String name = s.next();
        System.out.print("[1]Change Name \n[2]Change Number: ");
        int choice = s.nextInt();
        boolean result;
        switch (choice)
        {
            case 1:
                System.out.print("Enter The New Name: ");
                String namenew = s.next();
                result=array.modify(name,namenew);
                break;
            case 2:
                System.out.print("Enter The New Number: ");
                long number = s.nextLong();
                result=array.modify(name,number);
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }
        if(result)
        {
            System.out.println("Contact Modified");
        }
    }
}

