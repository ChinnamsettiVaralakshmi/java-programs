import java.util.*;
class StudentArr
  {
    String name;
    int rollnumber;
    char grade;
    public void setValues(String n,int r,char g)
    {
      name=n;
      rollnumber=r;
      grade=g;
    }
    public void display()
    {
      System.out.println(name+" "+rollnumber+" "+grade+" ");
    }
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      StudentArr arr[]=new StudentArr[3];
      for(int i=0;i<arr.length;i++)
        {
          System.out.println("Enter the student"+(i+1)+"details");
          arr[i]=new StudentArr();
          System.out.println("enter student name");
          String sname=sc.next();
          System.out.println("enter roll number");
          int sroll=sc.nextInt();
          System.out.println("enter grade");
          char sgrade=sc.next().charAt(0);
          arr[i].setValues(sname,sroll,sgrade);
        }
      for(int i=0;i<arr.length;i++)
        {
          arr[i].display();
        }
        
    }
      
    }
  