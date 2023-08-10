/*Assignment 6: Custom Exception in Banking Application Build a simple banking application in Java. Create a custom checked exception named InsufficientFundsException, which will be thrown when a user tries to withdraw an amount that exceeds their account balance. Implement classes for bank accounts, and provide methods for depositing and withdrawing money. Throw the InsufficientFundsException when a withdrawal amount is greater than the available balance. Handle this exception in an appropriate way and display a user-friendly error message.*/
import java.util.*;
class InsufficientFundsException extends Exception
{
  InsufficientFundsException(String message)
  {
    super(message);
  }
}
class BankAccount
  {
    double balance;
    public void setBalance(double balance)
    {
      this.balance=balance;
    }
    public void deposit(double amount)
    {
     balance=balance+amount; 
      System.out.println("the balance is "+balance);
    }
  
public void withdraw(double amount)throws   InsufficientFundsException 
  {
  if(amount>balance)
  {
 throw new InsufficientFundsException("Insufficient balance");
  }
  else
  {
    balance=balance-amount;
    System.out.println("the balance is"+balance);
  }
  }}
  class Bank
    {
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        withdraw w=new withdraw();
        System.out.println("enter the balance");
        double amount=sc.nextDouble();
        System.out.println("enter the deposit amount");
        double amt=sc.nextDouble();
        System.out.println("enter the withdraw amount");
        double withdraw=sc.nextDouble();
        try
          {
           w.withdraw(amount);
          }
        catch(InsufficientFundsException e)
          {
          System.out.println(e);
          }
      System.out.println("exception handled");
      }
    }
  
