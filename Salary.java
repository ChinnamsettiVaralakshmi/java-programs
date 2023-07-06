import java.util.Scanner;
class Salary
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a salary");
      double salary=sc.nextDouble();
      if(salary<=1000)
      {
        double hra=((salary*20)/100);
        double da=((salary*80)/100);
        double grosssalary=(salary+hra+da);
        System.out.println("gross salary is:"+(salary+hra+da));
      }
      else if(salary<=20000)
      {
       double hra=((salary*25)/100);
        double da=((salary*90)/100);
        double grosssalary=(salary+hra+da);
        System.out.println("gross salary is:"+(salary+hra+da)); 
      }else
      {
        double hra=((salary*30)/100);
        double da=((salary*95)/100);
        double grosssalary=(salary+hra+da);
        System.out.println("gross salary is:"+(salary+hra+da)); 
      }
    }
  }