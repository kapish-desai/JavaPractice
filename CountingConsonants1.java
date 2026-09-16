package stringsPractice;

public class CountingConsonants1 {
    public static void main(String[] args) {
        //type 1
        String s="Vengenece Knight Batman ---> 1992 The Animated Series"; //count consonants in this String
        int count=0;
        String x=s.toLowerCase();
        String vowels="aeiou";

        for (int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(!vowels.contains(String.valueOf(c)) && Character.isLetter(c))
                count++;
            //what we did here is,
            //we excluded vowels by putting NOT(!) before vowels.contains
            //but String contains other characters too like spaces and =
            //to exclude them we used Character.isLetter()
            //what it does, filters out the other characters present in String except the letters or alphabets
            //only the consonants are counted
        }
        System.out.println("Consonant count in "+s+"="+count);
    }
}
