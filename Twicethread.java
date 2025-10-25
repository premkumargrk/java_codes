class Twize extends Thread{
    private int values=90;
    public void run(){
        for(int i=0; i<values;i++)
        System.out.println("the value: "+i);
    }
}
class SecondTwize extends Thread{
    private int values=-90;
     public void run(){
        for(int i=0; i>values;i--)
        System.out.println("the second value: "+i);
    }
}

public class Twicethread {
    public static void main(String[] args){
        // Twize a =new Twize();
        SecondTwize t=new SecondTwize();
        // a.start();
        t.run();
        t.run();
    }
}