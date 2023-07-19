import java.util.*;
class Employee
  {
    String name;
    int id;
    int salary;
    String designation;
    public void display()
    {
      System.out.println(name +" "+id +" "+ salary +" "+designation + " ");
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Employee e[]=new Employee[3];
      for(int i=0;i<e.length;i++)
        {
          System.out.println("employees are "+(i+1));
          e[i]=new Employee();
          System.out.println("enter name");
          e[i].name=sc.next();
          System.out.println("enter id");
          e[i].id=sc.nextInt();
          System.out.println("enter salary");
          e[i].salary=sc.nextInt();
          System.out.println("enter the designation");
          e[i].designation=sc.next();
        }
      for(int i=0;i<e.length;i++)
        {
          e[i].display();
        }
    }
  }