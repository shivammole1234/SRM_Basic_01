package interviewDurgesh.Thread;

public class MyThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("hii this is my thread 1 run method");
        for(int i=0;i<5;i++){
            System.out.println("i :- "+i);
        }
    }

    public static void main(String[] args) {
        System.out.println("main started");
        MyThread1 mt=new MyThread1();
        Thread t=new Thread(mt);
        t.start(); //runnable state
    }
}
