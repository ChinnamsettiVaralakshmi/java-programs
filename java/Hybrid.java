class GrandFather
  {
    public void moles()
    {
      System.out.println("moles");
    }
  }
class Father extends GrandFather
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
class Daughter extends Father{
  public void laugh()
  {
    System.out.println("laughing");
  }
}
class Hybrid
  {
  public static void main(String args[])
    {
    Daughter d=new Daughter();
      Son s=new Son();
      d.laugh();
       d.snore();
      d.moles();
       s.eat();
    }
  }