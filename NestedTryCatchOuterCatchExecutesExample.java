package batcave;

public class NestedTryCatchOuterCatchExecutesExample {
    public static void main(String[] args) {
        try{
            try {
                String x=null;
                x.length(); //NullPointerException
            }
            catch (ArithmeticException e){
                System.out.println("Inner Catch Block Executes");
            }
        }
        catch(NullPointerException e){
            System.out.println("Outer Catch Block Executes");
        }
    }

}
