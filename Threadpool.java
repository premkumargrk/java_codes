import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class WorkerThread implements Runnable{
    private String taskName;

    public WorkerThread(String taskName){
        this.taskName=taskName;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is doing task: "+taskName);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException f){
            f.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" finished task: "+taskName);
    }
}
public class Threadpool {
    public static void main(String[] args){
        ExecutorService executor=Executors.newFixedThreadPool(5);
        for (int i=0;i<=6;i++){
            Runnable worker = new WorkerThread("task ->"+i);
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated()){
        }
            System.out.println("this is runned successfully");
    }
}
