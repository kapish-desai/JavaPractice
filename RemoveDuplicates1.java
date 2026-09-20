package stringsPractice;

public class RemoveDuplicates1 {
    public static void main(String[] args) {
        String s="banana"; //remove duplicates
        String result=""; //empty string

        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!result.contains(String.valueOf(c)))
                result+=c;
        }
        //contains() checks if the String or Character Sequence is present into the preexisting String or not
        //it works on non-primitive CharSequence and c is char primitive type so we did autoboxing
        //result+=c concats the char into string
        //result.concat(c) will work too.

        System.out.println("Original: "+s);
        System.out.println("Updated: "+result);
    }
}
