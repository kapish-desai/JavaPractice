package batcave;

public class MultipleCatchBlocksExample {

    public static void main(String[] args) {

        System.out.println("Program Starts");

        try {
            int a = 10;
            int b = 0;
            int result = a / b; //this will cause Arithmetic Exception
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticExeption : Cannot divide by zero"); //most specific exception for try block code
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e){
            System.out.println("Exception (Parent)"); //the parent level exception, most general exception which contains all the above types
        }

        System.out.println("Program Ends");
    }
}
