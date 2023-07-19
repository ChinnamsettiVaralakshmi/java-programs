/*: Single Inheritance

Create a superclass called "Animal" with the following attributes:
String name
int age
String breed*/
class Animal
  {
    String name;
    int age;
    String breed;
    public void qualities()
    {
      System.out.println("qualities");
    }
  }
class Dog extends Animal
{
  public void display()
  {
    System.out.println(name+" "+age+" "+breed+" ");
  }
}
class Animals
  {
    public static void main(String args[])
    {
      Dog d=new Dog();
      d.name="tom";
      d.age=12;
      d.breed="lab";
      d.qualities();
      d.display();
    }
  }