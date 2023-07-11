import java.util.*;
class Mins
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      int min=str1[0].length();
     String word="";
    for(int i=0;i<str1.length;i++)
      {
        if(min>str1[i].length())
        {
          min=str1[i].length();
          word=str1[i];
        }
      }
      System.out.println("The min word in the string is "+ word);
    }
  }