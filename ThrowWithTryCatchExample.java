package batcave;

public class ThrowWithTryCatchExample {
    public static void main(String[] args) {
        int age=15;
        try{
            if(age<18){
                throw new IllegalArgumentException("Underage");
            }
            System.out.println("Eligible"); //this will not execute because of Exception
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program Ends");
    }
}
