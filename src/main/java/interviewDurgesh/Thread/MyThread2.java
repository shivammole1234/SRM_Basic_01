package interviewDurgesh.Thread;

public class MyThread2 extends Thread{

    public void run(){
        System.out.println("Child Thread");
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        MyThread2 t1=new MyThread2();
        t1.start(); //start method internally calls the run() method of thread.
        System.out.println(t1.getName());
        System.out.println("Main Thread Ended");

        Runnable rt=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Interface");
            }
        };
        Thread tt=new Thread(rt);
        tt.start();
    }
}
