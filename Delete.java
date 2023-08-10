import java.util.Scanner;
class Delete
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of elements");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the element want to remove");
      int ele=sc.nextInt();
      for(int i=ele;i<a.length;i++)
        {
          if(a[i]==ele)
          {
            for(int j=0;j<a.length-1;j++)
              {
                a[j]=a[j+1];
              }
            break;
          }
        }
      System.out.println("the deletion element are");
        for(int i=0;i<a.length-1;i++){
        System.out.println(a[i]);
    }  }                      
  }