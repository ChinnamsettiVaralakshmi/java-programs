import java.util.*;
class ArrayElements
  {
    public void elements()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("array elements are");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("the elements are");
      for(int i=0;i<n;i++)
        {
          System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
      ArrayElements ae=new ArrayElements();
      ae.elements();
    }
  }