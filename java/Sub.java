import java.util.Scanner;
class Sub
  {
    public void subtraction()
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("the subtraction is "+(a-b));
    }
    public static void main(String args[])
    {
      Sub s=new Sub();

      s.subtraction();
    }
  }