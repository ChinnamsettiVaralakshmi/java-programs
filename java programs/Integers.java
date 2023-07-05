import java.util.*;
class Integers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
      int num1=sc.nextInt();
        System.out.println("enter the second number");
      int num2=sc.nextInt();
        System.out.println("enter the third number");
      int num3=sc.nextInt();
        System.out.println("enter the fourth number");
      int num4=sc.nextInt();
      if(num1==num2&&num2==num3&&num3==num4)
      {
        System.out.println("equal");
      }
      else{
        System.out.println("not equal");
      }
    }
  }