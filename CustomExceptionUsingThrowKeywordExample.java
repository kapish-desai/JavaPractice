package batcave;

class Wayne{}

class BruceWayne extends Wayne{}

class WayneException extends Exception{

    public WayneException(String message){
        super(message);
    }
}
public class CustomExceptionUsingThrowKeywordExample {
    public static void main(String[] args) {

        BruceWayne bruceWayne=new BruceWayne();
        try{

            if(bruceWayne instanceof Wayne){
                throw new WayneException("Bruce Wayne is Batman");
            }
        }
        catch (WayneException we){
            System.out.println(we.getMessage());
        }
        System.out.println("Program Ends");
    }
}
