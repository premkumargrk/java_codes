// class Reenter {
//     public synchronized void outBox(){
//         System.out.println(Thread.currentThread().getName()+"entered outerBox");
//         innerBox();
//     }

//     public synchronized void innerBox(){
//         System.out.println(Thread.currentThread().getName()+"entered innerBox");
//     }
// }

// public class Reentrant{
//     public static void main(String [] args){
//         Reenter obj=new Reenter();
//         Thread t1=new Thread(() -> obj.outBox(),"Thread-1");
//         Thread t2=new Thread(() -> obj.outBox(),"Thread-2");
//         Thread t3=new Thread(() -> obj.outBox(),"Thread-3");
//         Thread t4=new Thread(() -> obj.outBox(),"Thread-4");
//         Thread t5=new Thread(() -> obj.outBox(),"Thread-5");

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//         t5.start();
       
//     }
// }



// import java.util.concurrent.locks.ReentrantLock;

// class Job{
//     private final ReentrantLock lock = new ReentrantLock();

//     public void Outertask(){
//         lock.lock();
//         try{
//             System.out.println(Thread.currentThread().getName()+"entered outertask");
//             Innertask();
//         } finally{
//             lock.unlock();
//         }
//     }

//     public void Innertask(){
//         lock.lock();
//         try{
//             System.out.println(Thread.currentThread().getName()+"entered innertask");
//         } finally{
//             lock.unlock();
//         }
//     }
// }

// public class Reentrant{
//     public static void main(String[] args){
//         Job task = new Job();
//         Thread t1= new Thread(task::Outertask,"1_thread");
 
//         Thread t2= new Thread(task::Outertask,"2_thread"); 
//         Thread t3= new Thread(task::Outertask,"3_thread");
//         Thread t4= new Thread(task::Outertask,"4_thread");
//         Thread t5= new Thread(task::Outertask,"5_thread");
//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//         t5.start();

//     }
// }



class Sharedata{
    volatile boolean flag = false;

    void Waiting(){
        System.out.println("Waiting for a flag to change into true");
        while(!flag){
        }
        System.out.println("Flag is not true");
    }

    void Change(){
        flag=true;
        System.out.println("flag changed to true");
    }
}

public class Reentrant{
    public static void main(String[] args){
        Sharedata data = new Sharedata();
        Thread t1 = new Thread(data::Waiting);
        try{
             t1.start();
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        data.Change();
    }
}