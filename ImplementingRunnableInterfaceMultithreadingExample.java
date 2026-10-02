package batcave.multithreading;

class MyTask implements Runnable{
    //implementing the Runnable Interface

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Thread Running : "+i);
        }
    }
    //giving execution to run() method of Runnable Interface
}
public class ImplementingRunnableInterfaceMultithreadingExample {
    public static void main(String[] args) {

        MyTask task=new MyTask(); //creating object
        Thread thread=new Thread(task); //passing the task object into Thread Object
        thread.start(); //starting thread
    }
}
