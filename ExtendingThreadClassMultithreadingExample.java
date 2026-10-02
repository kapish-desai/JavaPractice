package batcave.multithreading;

class MyThread extends Thread{
    //this class extends the 'Thread' class and creates a new thread
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("Thread is Running: "+i);
        }
    }
    //overrides the run() method of Thread class and gives it custom execution
}
public class ExtendingThreadClassMultithreadingExample {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start(); //starting the thread
    }
}
