import java.util.Scanner;
class Perfect
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      int sum=0;
      for(int i=1;i<num;i++)
        {
          if(num%i==0)
          {
            sum=sum+i;
          }
        }
      if(num==sum)
      {
        System.out.println("it is a perfect");
      }
      else{
        System.out.println("its is not a perfect");
    }
  }}