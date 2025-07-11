package Ashish;

import java.util.Scanner;

public class Ashu
{
    private int PIN = 9411;
    private String AccountHolderName = "ASHISH KUMAR";
    private String FatherName = "OM PRAKASH";
    public float Balanc;

    public Ashu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your PIN Number:-");
        int Pin = sc.nextInt();
        if(PIN == Pin)
        {
            System.out.println("AccountHolderName:-"+ AccountHolderName+" S/O "+FatherName);
            System.out.println();
            Menu();
        }
        else
        {
            System.out.println("Invalid PIN Please Try Again");

        }

    }

    // Menu Method
    public void Menu()
    {
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdrawal");
        System.out.println("4.Exit");


        // user Choice input
        while(true)
        {
        System.out.println("Enter Your Choice:-");

        Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if (opt == 1)
            {
                Check_Balance();
            }
            else if (opt == 2)
            {
                Deposit();
            }
            else if (opt == 3)
            {
                Withdrawal();
            }
            else if (opt == 4)
            {
                Exit();
            }
            else
            {
                System.out.println("Enter Valid Number");
            }

        }
    }

    // Check Balance
    public void Check_Balance()
    {
        System.out.println("Balance:-" + Balanc);
    }

    // Deposit
    public void Deposit()
    {
        System.out.println("Enter Deposit Amount:-");
        Scanner sc=new Scanner(System.in);
        float Amount = sc.nextFloat();

        Balanc = Balanc + Amount;
        System.out.println("Amount Deposit Successfully");
    }

    // Withdrawal
    public void Withdrawal()
    {
        System.out.println("Enter Withdrawal Amount:-");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        if(Amount > Balanc)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            Balanc = Balanc - Amount;
        }
    }

    // Exit
    public void Exit()
    {
        System.exit(0);
    }
}
