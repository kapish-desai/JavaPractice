package batcave;

class CustomException extends Exception{
    public CustomException(){} //constructor
}
public class ThrowsMultipleExceptionExample {

    public static void exceptionsGeneratingMethod() throws ArithmeticException, NullPointerException, CustomException{

        //ArithmeticException
        int a=10;
        int b=0;
        int result=a/b; //this generates Arithmetic Exception

        //NullPointerException
        String x=null;
        x.length(); //this generates NullPointerException

        //CustomException
        throw new CustomException();  //custom exception generated


        //Note: Here when ArithmeticException occurs then the below line of code doesn't execute and it directly goes to try catch
        //the throws keyword can throw multiple exception this code only proves that thing
    }

    public static void main(String[] args) {

        try {
            exceptionsGeneratingMethod();
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException Handled");
        }
        catch (NullPointerException e){
            System.out.println("NullPointerExceptionHandled");
        } catch (CustomException e) {
            System.out.println("CustomException Handled");
        }
    }
}
