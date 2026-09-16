package stringsPractice;

public class CountingWords1 {
    public static void main(String[] args) {
        String s="Java is Powerful";

        String[] words=s.split(" ");
        //what happened here
        //'words' is a String Array, it stores strings as elements into it
        //the s.split(" ") method breaks the string "Java is poweful" into multiple parts
        //the " " present inside the split method breaks the string wherever it finds " "(white space)

        int count=words.length; //we just calculated the lenght of String array 'words'

        System.out.println("Count of words present in string "+s+"= "+count);
    }

    //the 'words' was a String array and to get its length we used 'length' method
    //For finding the length of String we use 'length()' method
    //Don't get confused
}
