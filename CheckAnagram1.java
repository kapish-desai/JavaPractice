package stringsPractice;

import java.util.Arrays;

//ANAGRAMS
//anagram means two word which contain same letter with same frequency of each letter
//Ex: 'listen' and 'silent' both contain same alphabets and alphabets have same frequency
public class CheckAnagram1 {
    public static void main(String[] args) {
        String s1="Tom          Marvolo    Riddle       ";
        String s2="I a m Lord Vold   emort";
        //check if s1 and s2 are anagrams

        //turning it to lower case to properly identify the letters
        //using regex to rectify the blank spaces
        String x1=s1.toLowerCase().replaceAll("\\s+","");
        String x2=s2.toLowerCase().replaceAll("\\s+","");

        //converting the strings to character arrays
        char[] c1=x1.toCharArray();
        char[] c2=x2.toCharArray();

        //sorting character arrays
        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println(s1+" and "+s2+" are anagrams");
        }
    }
}
