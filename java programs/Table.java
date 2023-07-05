import java.util.*;
class Table
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      for(int i=0;i<=20;i++)
        {
          System.out.println(n + "*" + i + "=" + (n*i));
        }
    }
  }