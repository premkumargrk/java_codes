class One extends Thread {
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.printf("the first value is: %d\n",i);
        }
    }
}

class Two implements Runnable {
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.printf("the second value is: %d\n",i);
        }
    }
}

class Three implements Runnable {
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.printf("the third value is: %d\n",i);
        }
    }
}


public class Threads{
    public static void main(String[] a){
        One first=new One();
        Thread second=new Thread(new Two());
        Thread third=new Thread(new Three());

        first.start();
        second.start();
        third.start();
    }
}