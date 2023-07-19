class Parents
  {
    public void moles()
    {
      System.out.println("moles");
    }
  }
class Father extends Parents
{
 public void snore()
  {
    System.out.println("snoring");
  }
}
class Son extends Parents{
  public void eat()
  {
    System.out.println("eating");
  }
}
class Heirarichal
  {
  public static void main(String args[])
    {
    Son s=new Son();
    Father f=new Father();
  
      s.eat();
      f.moles();
    }
  }