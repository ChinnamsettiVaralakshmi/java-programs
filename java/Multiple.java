class A
  {
    public void message()
    {
      System.out.println("hello");
    }
  }
class B
  {
    public void message()
    {
      System.out.prinltn("hi");
    }
  }
class C extends A,B
  {
    public static void main(String args[])
    {
      c obj=new c();
      obj.message();
    }
    
  }