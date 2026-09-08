package batcave;

public class ThrowsKeywordExample {

    public void normalMethod() throws ArithmeticException{
        System.out.println("This method generates ArithmeticException but doesn't handle it");
        int a=10;
        int b=0;
        int result=a/b;
    }

    public static void main(String[] args) {
        ThrowsKeywordExample throwsKeywordExample=new ThrowsKeywordExample();
        try{
           throwsKeywordExample.normalMethod();//method called here
            //now it needs to be handled
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException handled");
        }
        System.out.println("Program ends");
    }
}
