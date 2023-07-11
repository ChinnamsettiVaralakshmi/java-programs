import java.util.*;
class Notes
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the amount");
      int amt=sc.nextInt();
      int tnotes=0;
      int fnotes=0;
      int hnotes=0;
      if(amt%100==0)
      {
        while(amt>0)
          {
        if(amt>1000)
        {
          tnotes=amt/1000;
          amt=amt%1000;
      }
        else if(amt<1000&&amt>500)
        {
          fnotes=amt/500;
          amt=amt%500;
        }
 else {
        hnotes=amt/100;
        amt=amt%100;
}
      }
        System.out.println("no of notes are "+tnotes+fnotes+hnotes);
    }
    
      else{
        System.out.println("enter the amount of multiple of 100");
      }
  }}