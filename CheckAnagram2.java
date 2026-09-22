package stringsPractice;

//important (optimized approach) keep in mind
public class CheckAnagram2 {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";

        //rectifying the Strings
        String x1=s1.toLowerCase().replaceAll("\\s+","");
        String x2=s2.toLowerCase().replaceAll("\\s+","");

        //First layer of verification
        if(x1.length()!=x2.length()) {
            System.out.println(s1 + " and " + s2 + " are not anagrams length doesn't match");
            return;
        }
        //this checks if the string are of same length. If not same length, it will be declared as 'not an anagram' here itself
        //the 'return' jump statement ends the program here itself.


        int[] frequency=new int[256]; //created a new integer array named 'frequency'

        for (int i=0;i<x1.length();i++){
            frequency[x1.charAt(i)]++;
            frequency[x2.charAt(i)]--;
        }
        //now what is happening here
        //the frequency arrays tells about the frequency of each letter in the string
        //the for loop is used to access each character of string
        //frequency[x1.charAt(i)]++ increases the frequency of the particular letter from string x1 according to index i
        //Ex: It increases the frequency of 'l' from 0 to 1 in 'listen' string which is x1
        //frequency[x2.charAt(i)]-- decreases the frequency of the particular letter from string x2 according to index i
        //Ex: It decreases the frequency of 'l' from 1 to 0 in 'silent' string which is x2
        //the frequency was already 1 because the previous line increased the frequency of that letter

        boolean flag=true;

        //second and final layer of verification
        for(int i=0;i<x2.length();i++){
            if(frequency[x2.charAt(i)]!=0){
                flag=false;
                break;
            }
        }
        //here the frequency of all letter present into x2 String is checked
        //it checks if frequency of all letters is 0
        //if any letter has frequency more than 0 then the flag turns to false and the else block executes
        //if all letters have 0 frequency then the flag remains true and the if block executes

        //I hope you understood this
        //You know how it works don't get confused
        //It might seem hard now, but it is easy
        //You know how this works
        //Read code clearly and you'll understand

        if(flag)
            System.out.println(s1+" and "+s2+" are anagrams");
        else
            System.out.println(s1+" and "+s2+" are not anagrams");

    }
}
