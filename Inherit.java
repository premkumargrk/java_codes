
    class Parent {
    // method 1
    void word(String msg) {
        System.out.println("Parent: " + msg);
    }
    void ride(){
        System.out.println("this is parent class");
    }
}

class Child extends Parent {
    // method 2 (overloading, different parameter list)
    void number(int number) {
        System.out.println("Child: " + number);
    }
    void ride(){
        System.out.println("this is child class");
    }
    // method 3 (overloading, different parameter list)
}
  class Child2 extends Child{
    void add(String msg, int number) {
        System.out.println("Child: " + msg + ", " + number);
    }
    void ride(){
        System.out.println("this is child2 class");
    }
  }

public class Inherit {
  public static void main(String[] args){
    Child2 second = new Child2();
    Parent zero=new Parent();
    Child first=new Child();
        second.word("person_01");
        second.number(65);
        second.add("Person_01",65);
        second.ride();
        first.ride();
        zero.ride();
        
  }
}
