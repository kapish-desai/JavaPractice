package stringsPractice;

public class RemoveBlankSpaces2 {
    public static void main(String[] args) {
        String s="      Representing     the\tABQ          Jessie Pinkman      "; //'\t' creates a space in string
        String x=s.trim().replaceAll("\\s+","");
        //'\\s+' is regex, we need replaceAll() to make it work
        //trim() removes the blanks before and after the literals
        System.out.println("Old: "+s);
        System.out.println("New: "+x);
    }
}
