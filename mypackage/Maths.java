package mypackage;

public class Maths {
    public double square(double num){
        double result = num*num;
        System.out.println("Square of "+num+" : "+result);
        return 1;
    }
    public double squareRoot(double num){
        if (num<0){
            System.out.println("can't be less than zero");
            return -1;
        }
        else{
            double result = Math.sqrt(num);
            System.out.println("square root of: "+result);
            return result;
        }
    }
   
}
