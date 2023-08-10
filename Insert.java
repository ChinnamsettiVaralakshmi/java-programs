import java.util.Scanner;
class Insert
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the element size");
      int size=sc.nextInt();
      System.out.println("enter the array elements");
      int a[]=new int[size];
       size=a.length;
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      int b[]=new int[a.length+1];
      System.out.println("enter the value to insert");
      int value=sc.nextInt();
      System.out.println("enter the position");
      int pos=sc.nextInt();
      for(int i=0;i<b.length;i++)
        {
        if(i==pos)
          {
             b[i]=value;
          }
          else if(i>pos){
            b[i]=a[i-1];
          }
          else{
            b[i]=a[i];
          }
          System.out.println("the array elements are");
          for(int j=0;j<b.length;j++)
          System.out.println(b[j]);
            }
        }
      
    }
  