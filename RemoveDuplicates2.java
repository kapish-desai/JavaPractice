package stringsPractice;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        String s="anna  osn ene skhe ";
        StringBuilder result=new StringBuilder(); //StringBuilder object created

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!result.toString().contains(String.valueOf(c)))
                result.append(c);
        }
        //what happened here,
        //the 'contains()' method checks if the String contains the particular CharSequence or String into the pre-existing String
        //It works on non-primitive type and 'c' is char (primitive type). So String.valueOf(c) performs autoboxing converts char to String
        //the 'result' is StringBuilder and the contains() method works on String type so we used 'toString()' to convert String to StringBuilder
        //used not(!) so that if the char c is not present in result, the condition inside if would be true and 'if' will execute
        //the 'append()' method belongs to StringBuilder it adds the new character to StringBuilder result.

        System.out.println("Original: "+s);
        System.out.println("Modified: "+result);

        //the original string "anna  osn ene skhe " there are 2 blank spaces present in between anna and osn
        //only 1 white space is kept in modified string and the result becomes "an osekh"  removing all white spaces too
        //because white spaces are also considered as characters.
    }
}
