package AtmSystem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account 
{
    private int CustomerNumber;
    private int PinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");
    
    public int setCustomerNumber(int CustomerNumber)
    {
        this.CustomerNumber=CustomerNumber;
        return CustomerNumber;
    }
    public int getCustomerNumber()
    {
        return CustomerNumber;
    }

    public int setPinNumber(int PinNumber)
    {
    this.PinNumber=PinNumber;
    return PinNumber;
    }
    public int getPinNumber()
    {
        return PinNumber;
    }

    public double getCheckingBalance()
    {
        return checkingBalance;
    }
    public double getSavingBalance()
    {
        return savingBalance;
    }

    public double calcCheckingWithdraw(double amount)
    {
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount)
    {
        savingBalance=(savingBalance-amount);
        return savingBalance;
    }

    public double calcSavingDeposit(double amount)
    {
        savingBalance=(savingBalance+amount);
        return savingBalance;

    }

    public double calcCheckingDeposit(double amount)
    {
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;
    }

    public void getCheckingWithdrawInput()
    {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Withdraw from Checking Account: ");
        double amount =input.nextDouble();

        if((checkingBalance-amount)>=0)
        {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balanace: "+ moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("You Do Not have Enough Balanace in Your Account.");
        }
    }

    public void getSavingWithdrawInput()
    {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to Withdraw from Saving Account: ");
        double amount =input.nextDouble();

        if((savingBalance-amount)>=0)
        {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balanace: " + moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("You Do Not have Enough Balanace in Your Saving Account.");
        }
    }
    public void getCheckingDepositInput()
    {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Deposit from Checking Account: ");
        double amount =input.nextDouble();

        if((checkingBalance+amount)>=0)
        {
            calcCheckingDeposit(amount);
            System.out.println("New Saving Account Balanace: "+ moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("You Do Not have Enough Balanace in Your Saving Account.");
        }
    }
    public void getSavingDepositInput()
    {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to Deposit from Saving Account: ");
        double amount =input.nextDouble();

        if((savingBalance+amount)>=0)
        {
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balanace: "+ moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("You Do Not have Enough Balanace in Your Saving Account.");
        }
    }
}
