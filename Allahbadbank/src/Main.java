import java.util.*;
import java.lang.Math;


public class Main
{

    public static void main(String[] args)
    {
            current C[]=new current[20];
            savings S[]=new savings[20];
            int cno=0,sno=0;
            int flag=0;
            Scanner s = new Scanner(System.in);
            for(flag=0;flag>=0;)
            {
                System.out.print("[1]Create \n[2]Login \n[3]Exit ");
                flag = s.nextInt();
                if(flag ==1)
                {
                    System.out.print("[1] Savings \n[2] Current : ");
                    int c =s.nextInt();

                    if(c==1)
                    {
                        System.out.println(c);
                        S[sno] = new savings();
                        S[sno].Open();

                        System.out.print("Account created \n");
                        S[sno].Output();
                        int choice =0;
                        for(;;)
                        {
                            System.out.print("[1] Interest \n[2]Withdraw \n[3]Deposit \n[4] Display \n[5] Exit: ");
                            choice = s.nextInt();
                            if(choice == 1)
                                S[sno].caluculate();
                            else if(choice ==2)
                                S[sno].withdraw();
                            else if(choice ==3)
                                S[sno].Diposit();
                            else if(choice ==4)
                                S[sno].Output();
                            else if(choice==5) break;
                        }
                        sno+=1;
                    }
                    if(c==2)
                    {
                        C[cno] = new current();
                        C[cno].Open();

                        System.out.print("Account created \n");
                        C[cno].Output();
                        int choice =0;
                        for(;;)
                        {
                            System.out.print("[1] Cheque \n[2]Withdraw \n[3]Deposit \n[4] Display \n[5] Exit: ");
                            choice = s.nextInt();
                            if(choice == 1)
                                C[cno].cheque();
                            else if(choice ==2)
                                C[cno].withdraw();
                            else if(choice ==3)
                                C[cno].Diposit();
                            else if(choice ==4)
                                C[cno].Output();
                            else if(choice==5)
                                break;
                        }

                        cno+=1;
                    }
                }
                if(flag ==2)
                {

                    System.out.print("[1] Savings \n[2] Current : ");
                    int c = s.nextInt();
                    if(c==1)
                    {

                        System.out.print("Enter the account no: ");
                        int acno = s.nextInt();
                        acno--;
                        if(acno <= sno)
                        {
                            int choice =0;
                            for(;;) {
                                System.out.print("[1] Interest \n[2] Withdraw \n[3] Deposit \n[4] Display \n[5] Exit: ");
                                choice = s.nextInt();
                                if (choice == 1)
                                    S[acno].caluculate();
                                else if (choice == 2)
                                    S[acno].withdraw();
                                else if (choice == 3)
                                    S[acno].Diposit();
                                else if (choice == 4)
                                    S[acno].Output();
                                else
                                    break;
                            }
                        }
                    }

                    else if(c==2)
                    {
                        int acno = -1;
                        System.out.print("Enter the account no: ");
                        acno = s.nextInt();
                        acno--;
                        if(acno < cno)
                        {
                            int choice =0;
                            for(;;){
                                System.out.print("[1] Cheque \n[2] Withdraw \n[3] Deposit \n[4] Display \n[5] Exit: ");
                                choice = s.nextInt();
                                if(choice == 1)
                                    C[cno].cheque();
                                else if(choice ==2)
                                    C[cno].withdraw();
                                else if(choice ==3)
                                    C[cno].Diposit();
                                else if(choice ==4)
                                    C[cno].Output();
                                else
                                    break;
                            }
                        }
                    }
                }
                if(flag==3)
                    break;
            }
        }
    }



class bank
{


    public int Account_Number;
    public float ballance;
    public String name;

    public void Open()
    {
        System.out.print("Enter the Name: ");
        Scanner s = new Scanner(System.in);
        name = s.next();
        System.out.print("Enter the Account Number: ");
        Account_Number = s.nextInt();
        for(int i=0 ; ballance <1000.00 ;i++)
        {
            System.out.print("Enter the Amount (Mininmum 1000Rs): ");
            ballance = s.nextFloat();
        }
        System.out.print("New Account Created");
    }
    public void Output()
    {
        System.out.print("Name: " + name);
        System.out.print("Account No: " +Account_Number);
        System.out.print("Ballance: " + ballance);
    }
    public void Diposit()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the muney to be added: ");
        int n = s.nextInt();
        ballance +=n;
    }
}

class savings extends bank
{
    public void caluculate()
    {
        System.out.print("5% Interest rate \nHow many years has it been: ");
        Scanner s = new Scanner(System.in);
        double n = s.nextFloat();
        n = Math.pow(1.05f,n);
        ballance = ballance * (float)n;
        System.out.println("Your current balance is: " + ballance);
    }

    public void withdraw()
    {
        System.out.print("Enter the ammount to be withdrawn: ");
        Scanner s = new Scanner(System.in);
        float amount = s.nextFloat();
        if(amount < ballance)
        {
            ballance -= amount;
            System.out.print("Withdrawn \nTHe remaining balance is: " +ballance);
        }
        else
            System.out.print("Not Enough Balance ");
    }
}

class current extends bank
{
    public void cheque()
{
    System.out.print("The new cheque book will be issued");
}
    public void withdraw()
{
    System.out.print("Enter the ammount to be withdrawn: ");
    Scanner s = new Scanner(System.in);
    float amount = s.nextFloat();
    if(amount <ballance)
    {
        ballance -=amount;
        if(ballance <500.00)
        {
            ballance = ballance - (amount * 5 )/100;
            System.out.println("Withdrawn \n5% service charge was deducted because of low ballance \nThe remaining ballance id: " +ballance);
        }
        else
        {
            System.out.println("Withdrawn \nThe remaining balance is: "+ballance);
        }
    }
    else
        System.out.print("Low balance\n");
}
}

