import java.utill. Scanner;
class Student
  {
    private String name;
    private int rollno;
    private int age;
    private int marks;
    String grade;
    public void setName(String name)
    {
      this. name=name;
    }
    public String getName()
    {
      return name;
    }
    public void setRollno(int rollno)
    {
      this.rollno=rollno;
    }
    public int getRollno()
    {
      return rollno;
    }
    public void setAge(int rollno)
    {
      this.rollno=rollno;
    }
    public int getRollno()
    {
      return rollno;
    }
    public void setAge(int age)
    {
      this.age=age;
    }
    public int getAge(int age)
    {
      return age;
    }
    public void setMarks(int marks)
    {
      this.marks=marks;
    }
    public int getMarks()
    {
      return marks;
    }
    public String calculateGrade()
    {
      if((getMarks()>=90)&&(getMarks()<=100))
      {
        grade="A Grade";
        return grade;
      }
      else if((getMarks()<90)&&(getMarks()>=75))
      {
        grade="B Grade";
        return grade;
      }
      else if((getMarks()<=75)&&(getMarks()>=60))
      {
        grade="C grade";
      return grade;
    }
    else if((getMarks()<=60)&&(getMarks()>=45))
{
  grade="D Grade";
  return grade;
}
 else {
  grade="Fail";
   return grade;
 }
}
    public void displayDetails()
    {
      System.out.println("Name: "+getName());
      System.out.println("Rollno: "+getRollno());
      
    }
      
      
    
  
  