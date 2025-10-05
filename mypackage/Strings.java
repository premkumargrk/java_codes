package mypackage;

public class Strings {
    public void reverse(String n){
        StringBuilder name= new StringBuilder(n);
        System.out.println("reverse: "+name.reverse());
    }
    public void toUppercase(String n){
        System.out.println("uppercase: "+n.toUpperCase());
    }
}
