import java.util.*;
class Book
    {
      String name;
      int id;
      String author;
      int year;
      public void display()
      {
        System.out.println("the book name is "+name+"id is"+id+"author is"+author+"year is "+year);
      }
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
         Book b[]=new Book[3];
        for(int i=0;i<b.length;i++)
          {
            System.out.println("books are "+(i+1));
            b[i]=new Book();
            System.out.println("the book name");
            b[i].name=sc.next();
            System.out.println("the book id");
            b[i].id=sc.nextInt();
            System.out.println("the book author");
            b[i].author=sc.next();
            System.out.println("the book year");
            b[i].year=sc.nextInt();
          }
        for(int i=0;i<b.length;i++)
          {
            b[i].display();
          }
      }
    }
