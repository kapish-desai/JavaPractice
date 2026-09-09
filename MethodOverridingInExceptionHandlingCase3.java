package batcave;

//Method Overriding in Exception Handling
//Case 3: If Parent class method throws Unchecked Exception then,
//a. Subclass can throw any Unchecked Exception or any specific exception
//b. Subclass can throw no exception
//c. Subclass cannot throw any Checked Exception (compile-time error)


class ParentCase3{
    public void method() throws RuntimeException{}
}

class SubClass1Case3 extends ParentCase3{
    @Override
    public void method() throws NullPointerException{
        throw new NullPointerException("Subclass with unchecked exception"); //specific Exception
    }
}

class Subclass2Case3 extends ParentCase3{
    @Override
    public void method(){
        System.out.println("Subclass with no exception");
    }
}


public class MethodOverridingInExceptionHandlingCase3 {

    public static void main(String[] args) {

        SubClass1Case3 subClass1Case3=new SubClass1Case3();
        Subclass2Case3 subclass2Case3=new Subclass2Case3();

        try {
            subClass1Case3.method();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        try {
            subclass2Case3.method();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
