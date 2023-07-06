import java.util.Scanner;
class LowerOrUpper
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the letter");
      char ch=sc.next().charAt(0);
      if ((ch>='A')&&(ch<='Z'))
      {
        System.out.println("it is a upper case");
      }
      else if((ch>='a')&&(ch<='z'))
      {
        System.out.println("it is a lower case");
      }
 else 
      {
        System.out.println("it is not a letter");
}
        
    }
  }