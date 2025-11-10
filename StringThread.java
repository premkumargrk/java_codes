class StringTask extends Thread{
    private StringBuffer sb;

    StringTask(StringBuffer sb){
        this.sb=sb;
    }
    public void run(){
        synchronized(sb){
        for(int i=0; i<=5;i++){
            sb.append(i).append(" ");
            System.out.println(Thread.currentThread().getName()+" --> "+sb);
            try{
                Thread.sleep(800);
            } catch(InterruptedException s){
                System.out.println(s);
            }
        }
    }
}
}
public class StringThread {
    public static void main(String [] args ){
        StringBuffer sb=new StringBuffer("Initiate: ");
        StringTask t1=new StringTask(sb);
        StringTask t2=new StringTask(sb);
        StringTask t3=new StringTask(sb);

        t1.setName("one");
        t2.setName("two");
        t3.setName("three");

        t1.start();
        t2.start();
        t3.start();

    }
}
