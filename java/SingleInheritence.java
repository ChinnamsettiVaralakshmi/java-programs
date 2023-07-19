class Birds
{
 public void  fly(){
  System.out.println("flying");
}
}
class Crow extends Birds
{
  public void eat(){
  System.out.println("eating");
  }
}
class SingleInheritence
  {
    public static void main(String args[])
    {
      Crow c=new Crow();
      c.eat();
      c.fly();
    }
  }
