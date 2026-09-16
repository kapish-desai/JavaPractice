package stringsPractice;

public class CountingWords2 {
    public static void main(String[] args) {
        String s="  That's       the       beauty      of        JAVA           ";

        String[] words=s.trim().split("\\s+");
        //what happened here
        //trim() method removes the white spaces before and after the string
        //the split() breaks the String but the \\s+ is the regex (regular expression)
        //It states the compiler look out for one or more than one white spaces
        //by using the regex '\\s+' it becomes easy to handle white spaces without defining a particular amount of white spaces

        int count= words.length;

        System.out.println("Count of words in string "+s+"= "+count);
    }
}
