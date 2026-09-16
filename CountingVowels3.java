package stringsPractice;

public class CountingVowels3 {
    public static void main(String[] args) {
        //type 3
        String vowels="aeiou"; //creating a custom String for vowels
        String s="ImAgInAtIoN";
        int count=0;
        String x=s.toLowerCase(); //changing call characters to lower case.

        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(vowels.contains(String.valueOf(c)))
                count++;
            //here the 'c' was char and the 'contains' method worked for String type
            //we did autoboxing manually by converting char to String
            //did it by using String.valueOf()
        }
        System.out.println("Vowel count in "+s+"="+count);
    }
}
