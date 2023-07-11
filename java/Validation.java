/*Email Validation:
Write a program that takes an email address as input and validates whether it is a valid email format. The email should meet the following criteria:
It should contain an "@" and "." symbol.
It should end with ".com" or ".org".
Write a program that prompts the user to enter an email address and performs the validation. Print "Valid email" if the email address is valid, otherwise print "Invalid email".*/
import java.util.*;
class Validation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the email");
      String str=sc.nextLine();
      int count=0,ecount=0;
      if(str.contains("@")&&str.contains("."))
      {
        count++;
      }
      if(str.endsWith(".com")||str.endsWith(".org"))
      {
        ecount++;
      }
      if(count>0&&ecount>0)
      {
        System.out.println("email is valid");
      }
      else
        System.out.println("email is invalid");
    }
  }