// abstract class Person{  
//   abstract void eat(); 
//   abstract void again(); 
//   abstract void one();
//   abstract void two();
// }  
// class Nested{  
//  public static void main(String args[]){  
//   Person p=new Person(){  
//   void eat(){System.out.println("nice fruits");}
//   void again(){
//     System.out.println("the again function");
//   }
//   void one(){
//     System.out.println("the again function");
//   }  
//   void two(){
//     System.out.println("the second function");
//   }   
//   };
//   p.eat(); 
//   p.two();
//  }  
// }  


// public class Nested{  
//  private int data=30;//instance variable  
//  public int second_data=50;
//  void display(){  
//   class Local{  
//    void msg(){System.out.println(data+second_data);}  
//   }  
//   Local l=new Local();  
//   l.msg();  
//  }  
//  public static void main(String args[]){  
//   Nested obj=new Nested();  
//   obj.display();  
//  }  
// }  

// public class Nested{
//     static class Collect{
//         void show(){
//         System.out.println("this is from static nested class");
//     }
// }

// public static void main(String[] args){
//     Nested.Collect a= new Nested.Collect();
//     a.show();
// }
// }

// public class Nested{

//     public interface Vehicle{
//         void start();
//         void end();
//     }

//     static class CarEngine implements Vehicle{
//         public void start(){
//             System.out.println("the vehicle is started");
//         }
//         public void end(){
//             System.out.println("the vehicle is ended");
//         }
//     }
//     public static void main(String[] args){
//         Nested.Vehicle value= new Nested.CarEngine();
//         value.start();
//         value.end();
//     }
// }