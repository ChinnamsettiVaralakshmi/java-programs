import java.util.*;
class Sample
  {
    public void subtraction()
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("the subtraction is "+(a-b));
    }
    public void addition()
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("the addition is "+(a+b));
    }
    public void multiplication()
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("the multiplication is "+(a*b));
    }
  }
class AddSubMul
  {
public static void main(String[] args)
  {
  Sample s=new Sample();
  s.addition();
    s.subtraction();
    s.multiplication();
  }
  }