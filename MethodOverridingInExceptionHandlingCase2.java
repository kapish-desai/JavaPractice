package batcave;

//Method Overriding in Exception Handling
//Case 2: If Parent class method throws Checked exception then,
//a. Subclass method can throw Checked Exception
//b. Subclass method can throw any Unchecked Exception
//c. Subclass method can throw no exception
//d. Subclass method cannot throw 'Exception e' because it is a broader parent class (compile-time error)
//e. Subclass method cannot throw any unrelated checked exception (compile-time error)

import java.io.FileNotFoundException;
import java.io.IOException;

class ParentCase2{
    public void method() throws IOException{} //throws checked exception
}

class Subclass1Case2 extends ParentCase2{
    @Override
    public void method() throws FileNotFoundException {
        throw new FileNotFoundException("Subclass with Checked Exception"); //throws more specific checked exception
    }
}

class Subclass2Case2 extends ParentCase2{
    @Override
    public void method() throws ArithmeticException {
        throw new ArithmeticException("Subclass with Unchecked Exception"); //throws unchecked exception
    }
}

class Subclass3Case2 extends ParentCase2{
    @Override
    public void method(){
        System.out.println("Subclass with no exception");
    }
}

public class MethodOverridingInExceptionHandlingCase2 {

    public static void main(String[] args) {

        Subclass1Case2 subclass1Case2=new Subclass1Case2();
        Subclass2Case2 subclass2Case2=new Subclass2Case2();
        Subclass3Case2 subclass3Case2=new Subclass3Case2();

        try{
            subclass1Case2.method();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            subclass2Case2.method();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        try {
            subclass3Case2.method();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
