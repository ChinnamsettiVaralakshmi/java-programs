import java.util.*;
class Cubes
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      for(int i=1;i<=num;i++)
        {
          System.out.println("the cube of"+ i+(i*i*i));
        }
        
    }
  }