package batcave;

public class NestedTryCatchMultilevelExample {

    public static void main(String[] args) {
        try{
            System.out.println("Outermost Try Block LEVEL 1"); //execute

            try {
                System.out.println("Middle Try Block LEVEL 2"); //execute

                try {
                    System.out.println("Innermost Try Block LEVEL 3"); //execute
                    int a=20;
                    int b=0;
                    int result=a/b; //ArithmeticException
                }
                catch (NullPointerException e) {
                    System.out.println("Innermost Catch Block LEVEL 3"); //not execute because exception type doesn't match
                }
            }
            catch (ArithmeticException e){
                System.out.println("Middle Catch Block LEVEL 2"); //will execute because exception type matched
            }
        } catch (Exception e) {
            System.out.println("Outermost catch block LEVEL 1"); //not execute because Exception type already matched
        }
    }
}
