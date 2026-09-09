package batcave;

public class NestedTryCatchInnerCatchExecutesExample {
    public static void main(String[] args) {

        try{
            try{
                int a=10;
                int b=0;
                int result=a/b;
            }
            catch (ArithmeticException e){
                System.out.println("Inner Catch Block Executes");
            }
        } catch (Exception e) {
            System.out.println("Outer Catch Block Executes");
        }
    }
}
