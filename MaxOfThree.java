import java.util.Scanner;
class MaxOfThree
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value");
      int b=sc.nextInt();
      System.out.println("enter c value");
      int c=sc.nextInt();
      if((a>b)&&(a>c))
        {
     System.out.println("a value is greater"+a);
        }
       else if(b>c)
      {
          System.out.println("b value is greater"+b);
      }
          else
      {
        System.out.println("c is greater"+c);   
}
}
  }