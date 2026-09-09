package batcave;

//Method Overriding in Exception Handling
//Case 1: If Parent class method throws No Exception then,
//a. Subclass method can throw no exception
//b. Subclass method can throw any Unchecked Exception
//c. Subclass method cannot throw any Checked Exception (compile-time error)

class Parent{
    public void method(){  //no exception
        System.out.println("Parent Class Method");
    }
}

class Subclass1 extends Parent{
    @Override
    public void method() {
        System.out.println("Subclass Method with no excepiton");
    }
}

class Subclass2 extends Parent{
    @Override
    public void method() throws RuntimeException {
        System.out.println("Subclass method throws Unchecked exception");
        throw new RuntimeException("RunTimeException from Subclass2");
    }
}



public class MethodOverridingInExceptionHandlingCase1 {
    public static void main(String[] args) {

        Subclass1 subclass1=new Subclass1();
        Subclass2 subclass2=new Subclass2();

        try {
            subclass1.method();
            subclass2.method();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
