package stringsPractice;

public class Palindrome1 {
    public static void main(String[] args) {
        //palindrome means the string looks the same when read from left to right and right to left

        //checking if these three strings are palindrome or not
        String s1="racecar";
        String s2="101";
        String s3="developer";

        //String 1 => racecar
        StringBuilder stringBuilder1=new StringBuilder(); //creating stringBuilder object

        for(int i=s1.length()-1;i>=0;i--){
            stringBuilder1.append(s1.charAt(i)); //adding the characters of s1 to stringBuilder1
        }

        if(s1.equals(stringBuilder1.toString())) //converting stringBuilder1 into String using toString method
            System.out.println(s1+" is a palindrome");
        else
            System.out.println(s1+" is not a palindrome");

        //String 2 => 101
        StringBuilder stringBuilder2=new StringBuilder();

        for (int j=s2.length()-1;j>=0;j--){
            stringBuilder2.append(s2.charAt(j));
        }

        if(s2.equals(stringBuilder2.toString()))
            System.out.println(s2+" is a palindrome");
        else
            System.out.println(s2+" is not a palindrome");

        //String 3 => developer
        StringBuilder stringBuilder3=new StringBuilder();

        for (int k=s3.length()-1;k>=0;k--){
            stringBuilder3.append(s3.charAt(k));
        }

        if (s3.equals(stringBuilder3.toString()))
            System.out.println(s3+" is a palindrome");
        else
            System.out.println(s3+" is not a palindrome");
    }
}
