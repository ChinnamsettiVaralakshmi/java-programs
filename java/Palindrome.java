import java.util.*;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the Strings");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      for(int i=0;i<str1.length;i++)
        {
          String temp=str1[i];
          String reverse="";
          for(int j=temp.length()-1;j>=0;j--)
            {
              reverse=reverse+temp.charAt(j);
            }
          if(temp.equals(reverse))
          {
            System.out.println("The Palindromes are : "+temp+" ");
          }
        }
    }
  }