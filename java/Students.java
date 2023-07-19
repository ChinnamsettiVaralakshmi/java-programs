//initializing the object using instance variables through array of objects
import java.util.*;
class Students
  {
    String name;
    int rollno;
    String address;
    public void display()
    {
      System.out.println("student details are");
      System.out.print("name :"+name+" "+"rollno : "+rollno+" "+"address : "+address);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Students student[]=new Students[3];
      for(int i=0;i<student.length;i++)
        {                       
          student[i]=new Students();
          System.out.println("enter student "+(i+1));
          System.out.println("enter name");
          student[i].name=sc.next();
          System.out.println("enter rollno");
          student[i].rollno=sc.nextInt();
          System.out.println("enter address");
         student[i].address=sc.next();
        }
      for(int i=0;i<student.length;i++)
        {
          student[i].display();
        }

    }
  }