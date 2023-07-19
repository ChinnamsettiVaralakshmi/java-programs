//without returntype with parameters
import java.util.*;
class Prime
  {
    public void primen(int n)
    {
      int count=0;
      for(int i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            count++;
          }
        }
      if(count==2)
      {
        System.out.println("it is a prime no");
      }
      else{
        System.out.println("it is not a prime no");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Prime p=new Prime();
      System.out.println("enter a number");
      int n=sc.nextInt();
      p.primen(n);
    }
  }