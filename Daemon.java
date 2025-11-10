class MyThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread runs");
        } else{
            System.out.println("user thread is running");
        }

        for(int i=0; i<=5;i++){
            System.out.println(i+" executed by"+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println(e);
            } 
            catch(java.lang.IllegalThreadStateException f){
                System.out.println("Mention Deamon thread at first: "+f);
            }
        }
    }
}

public class Daemon {
    public static void main(String[] args){
        MyThread t1=new MyThread();
        MyThread t2 =new MyThread();
        // MyThread t3 = new MyThread();
        // t3.setName("third_thread");
    try{
        t1.setName("Daemon_thread");
        t2.setName("second_thread");
        t2.start();
        t1.start();
        // t3.start();
        t1.setDaemon(true);
    }
    catch(IllegalThreadStateException g){
        System.out.println("Mention Deamon thread at first: "+g);
    }

    }
}
