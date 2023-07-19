import java.util.*;
class Product
  {
    String name;
    int price;
    int quantity;
    public void display()
    {
      System.out.println(name + " " +price +" "+quantity + " ");
        }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Product p[]=new Product[3];
      for(int i=0;i<p.length;i++)
        {
          System.out.println("product"+(i+1));
          p[i]=new Product();
          System.out.println("enter name");
          p[i].name=sc.next();
          System.out.println("enter price");
          p[i].price=sc.nextInt();
          System.out.println("enter the quantity");
          p[i].quantity=sc.nextInt();
        }
    for(int i=0;i<p.length;i++)
      {
        p[i].display();
      }
      
    }
  }