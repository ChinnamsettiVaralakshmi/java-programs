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
class Son extends Father{
  public void eat()
  {
    System.out.println("eating");
  }
}
class MultilevelInheritence
  {
    public static void main(String args[])
    {
      Son s=new Son();
      s.eat();
      s.snore();
      s.moles();
    }
  }