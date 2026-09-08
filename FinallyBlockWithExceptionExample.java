package batcave;

public class FinallyBlockWithExceptionExample {
    public static void main(String[] args) {

        try{
            int a=10;
            int b=0;
            int result=a/b; //ArithmeticException occurs
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");  //exception handled
        }
        finally{
            System.out.println("Finally Block Executes no matter what");
        }
    }
}
