import java.util.*;
class Maxs
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      int max=str1[0].length();
     String word="";
    for(int i=0;i<str1.length;i++)
      {
        if(max<str1[i].length())
        {
          max=str1[i].length();
          word=str1[i];
        }
      }
      System.out.println("The max word in the string is "+ word);
    }
  }