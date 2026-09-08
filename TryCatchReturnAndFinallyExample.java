package batcave;

public class TryCatchReturnAndFinallyExample {

    public static void main(String[] args) {
        try {
            System.out.println("Try Block Executes");
            int[] a={10,20,30};
            System.out.println(a[9]); //invalid index ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch Block Executes");
            System.out.println("Invalid index");
            return;
        }
        finally {
            System.out.println("Finally Block Executes no matter what");
        }
    }
}
