import java.util.*;
class Person
 {
String p_name;
int p_age;
String p_address; 
   public Person(String name,int age,String address)
 {
 p_name=name;
 p_age=age;
 p_address=address;
 }
   public static void main(String args[])
 {
Scanner sc=new Scanner(System.in);
 Person person[]=new Person[4];
for(int i=0;i<person.length;i++)
{
 System.out.println("enter person "+ (i+1) +"details");
System.out.println("enter name");
  String name=sc.next();
  System.out.println("enter age");
  int age=sc.nextInt();
  System.out.println("enter address");
  String adr=sc.next();
  person[i]=new Person(name,age,adr);
 }
   for(int i=0;i<person.length;i++)
 {
   person[i].display();
 }
 }
   public void display()
 {
   System.out.println("person name is "+p_name);
   System.out.println("person age is "+p_age);
  System.out.println("person from "+p_address);    
 }
 }