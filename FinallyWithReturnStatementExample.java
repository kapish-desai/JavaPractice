package batcave;

public class FinallyWithReturnStatementExample {
    public static void main(String[] args) {
        try{
            System.out.println("try block executes");
            return; //this is jump statement, it terminates the current method gives access to caller method
            //but even after encountering return statement, program will execute the finally block
            //after that it will pass the access
        } //try need either catch or finally, it can't just stay alone
        finally {
            System.out.println("Finally Block Executes no matter what");
        }
    }

}
