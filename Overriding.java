/*write a program on method overloading and method overriding*/
class Vehicle
{
 public void starting()
 {
     System.out.println("Engine starting");
 }
}
 class Car extends Vehicle
 {
     public void starting()
     {
         System.out.println("Car engine starting");
     }
 }
 class Motorcycle extends Vehicle
 {
     public void starting()
     {
         System.out.println("motorcycle engine starting");
     }
 }
 class Overriding
 {
     public static void main(String args[])
     {
         Vehicle v=new Vehicle();
         v.starting();
         Vehicle c=new Car();
         c.starting();
         Vehicle mc=new Motorcycle();
         mc.starting();
     }
 }