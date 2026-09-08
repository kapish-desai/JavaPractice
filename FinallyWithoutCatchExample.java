package batcave;

public class FinallyWithoutCatchExample {
    public static void main(String[] args) {

        try {
            String name=null;
            System.out.println(name.length()); //NullPointerException will occur
        }
        finally {
            System.out.println("Finally Block Executes no matter what");
        }

        //here the finally block will execute
        //after that the program will be terminated because of exception and absence of catch block to handle it.


    }
}
