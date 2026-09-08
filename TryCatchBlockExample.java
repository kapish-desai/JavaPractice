package batcave;

public class TryCatchBlockExample {

    public static void main(String[] args){
        System.out.println("Program Starts");

        try{
            int a=10;
            int b=0;
            int result=a/b;
            System.out.println("Not Reachable"); //this line will not execute because the exception has occured before this

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            System.out.println("Exception Handled");
        }
        System.out.println("Program Ends");
    }
}
