package batcave;

public class IntegerCachingExample {
    public static void main(String[] args) {

        //primitive values
        int a=567;
        int b=567;

        int m=23;
        int n=23;

        System.out.println(a==b); //true
        System.out.println(m==n); //true

        //Wrapper objects (withing range -128 to 127)
        Integer p=45;
        Integer q=45;
        System.out.println(p==q); //true

        //Weapper objects (outside range -128 to 127)
        Integer r=200;
        Integer s=200;
        System.out.println(r==s); //false

        //using .equals()
        System.out.println(r.equals(s)); //true
        System.out.println(p.equals(q)); //true
    }



}
