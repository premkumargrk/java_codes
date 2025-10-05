// // import java.io.IOException;

// class Operation{
//     double calculate(double a, double b){
//         System.out.println("default operation");
//         return 0;
//     }
// }

// class Addition extends Operation {
//     @Override
//     double calculate(double a, double b){
//         return a+b;
//     }
// }

// class Subtraction extends Operation {
//     @Override
//     double calculate(double a, double b){
//         return a-b;
//     }
// }

// class Multiplication extends Operation {
//     @Override
//     double calculate(double a, double b){
//         return a*b;
//     }
// }

// class Division extends Operation {
//     @Override
//     double calculate(double a, double b){
//         if (b==0){
//             throw new ArithmeticException("can't divide by zero");
//         }
//         else{
//             return a/b;
//         }
//     }
// }

// class Calculator{
//     double compute(Operation op, double a, double b){
//         return op.calculate(a, b);
//     }

//     double compute(Operation op, double a, double b,double c){
//         return op.calculate(op.calculate(a, b),c);
//     }
// }




// public class Poly{
//     public static void main(String[] args) {
//         Calculator calci=new Calculator();

//         Operation add= new Addition();
//         Operation sub=new Subtraction();
//         Operation mul=new Multiplication();
//         Operation div=new Division();

//         System.out.println("Addition: "+calci.compute(add, 10, 15));
//         System.out.println("subtraction: "+calci.compute(sub, 10, 15));
//         System.out.println("Multiplication: "+calci.compute(mul, 10, 15));
//         System.out.println("Division: "+calci.compute(div, 10, 15));

//         // three parameters
//         System.out.println("three parameters of Addition: "+calci.compute(add, 10, 15,20));     
//         System.out.println("Three parameters of subtraction: "+calci.compute(sub, 20, 15,10));

//                 // return op.calculate(op.calculate(a, b),c);
//                 //   op.calculate(a,b)  a=10, b=15 =25    
//                 //  p.calculate(25, 20)  45                        -5   return a-b      -5 - 20 = -25

//     }
// }

//covariant return type code

// class Car{
//     Car getCar(){
//         System.out.println("returning a GetCar");
//         return this;
//     }
// }

// class Bike extends Car{
//     Bike getBike(){
//         System.out.println("returning a GetBike");
//         return this;
//     }
    
//     void accelerate(){
//         System.out.println("Acceleration starts");
//     }
//     void brake(){
//         System.out.println("brake initiats");
//     }

// }
// public class Poly{
//     public static void main(String[] args) {
//         Car c=new Car();
//         c.getCar();

//         Bike b=new Bike();
//         b.getBike().accelerate();
//         b.getBike().brake();
//     }
// }

class One{
    String name;
    int id;


    {
        System.out.println("this is IIB method to create");
    }

    One(){
        System.out.println("default constructor");
    }

    One(String name, int id){
        this.name=name;
        this.id=id;
        System.out.println("the statement is: "+name+" "+id);
    }
}

public class Poly{
    public static void main(String[] args) {
        One first=new One();
        One second= new One("linus",89);
        System.out.println(first+" "+second);
        }
}