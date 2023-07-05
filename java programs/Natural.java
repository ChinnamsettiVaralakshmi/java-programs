import java.util.*;
class Natural
  {
    public static void main(String args[])
    {
      int sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num1");
      int num1=sc.nextInt();
       System.out.println("enter the num2");
      int num2=sc.nextInt();
       System.out.println("enter the num3");
      int num3=sc.nextInt();
       System.out.println("enter the num4");
      int num4=sc.nextInt();
       System.out.println("enter the num5");
      int num5=sc.nextInt();
      sum=(num1+num2+num3+num4+num5);
      System.out.println("the sum is"+sum);
      System.out.println("average is"+(sum/5));
    }
  }
