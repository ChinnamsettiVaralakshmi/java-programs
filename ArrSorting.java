import java.util.Scanner;
class ArrSorting
  {
    public static void main(String args[])
    {
      int temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the elements size");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements");
      
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              a[i]=sc.nextInt();
              if(a[i]>a[j])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }}
      System.out.println("array elemets after swapping");
      for(int i=0;i<size;i++){
      System.out.println(a[i]);
      }
              }
            }
      