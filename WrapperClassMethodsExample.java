package batcave;

public class WrapperClassMethodsExample {
    public static void main(String[] args) {

        //Parsing Methods (parseXxx(string s))
        String s1="121"; //this is a String
        int a=Integer.parseInt(s1); //it is a static method, Wrapper class name needed to access it.
        System.out.println(a); //print primitive value.

        //Value Representation (valueOf()) converts primitive or a string to wrapper class
        // primitive to wrapper
        int b=100;
        Integer c=Integer.valueOf(a); //convert primitive int to wrapper Integer

        //String to wrapper
        String s2="99.1F";
        Float f=Float.valueOf(s2); //convert string to wrapper float

        //Primitive Conversion (xxxValue()) converts Wrapper to primitive
        //Manual Unboxing
        Integer d=45; //autoboxing primitive value
        int e=d.intValue(); //it is an instance method reference variable needed to access it
        System.out.println(e);

        //String conversion (toString()) //converts the primitive or wrapper object to a standard string.
        int g=100;
        String s3=Integer.toString(g); // using toString as static method
        System.out.println(s3);

        Integer h=56;
        String s4=h.toString(); //using toString as intance method.
        System.out.println(s4);

        //Comparison methods (obj1.equals(obj2) and  obj1.compareTo(obj2))
        //equals() ---> boolean output,  it checks the equality
        Integer i=34;
        Integer j=78;

        System.out.println(i.equals(j)); //false answer

        //compareTo() ---> -1, 0, 1 output. Check equality and also compares both mathematical values
        //obj1>obj2 = 1
        //obj1<obj2 =-1
        //obj1=obj2 =0
        System.out.println(i.compareTo(j)); //-1
        System.out.println(j.compareTo(i)); //1

    }
}
