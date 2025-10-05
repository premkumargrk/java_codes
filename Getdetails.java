import exam.*;

public class Getdetails {
    public static void main(String[] args) {
        Rules a=new Rules();
        a.showrules();
        Registration b= new Registration("S910","linus Torvalds");
        b.showdetails();
        b.register("python DSA");
        b.register("java Networking");
    }
}
