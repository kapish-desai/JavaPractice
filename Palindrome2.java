package stringsPractice;

public class Palindrome2 {
    public static void main(String[] args) {
        String s="level";
        int left=0;
        int right=s.length()-1;
        boolean palindrome=true;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                palindrome=false;
                break;
            }
            left++;
            right--;
        }

        if(palindrome)
            System.out.println(s+" is a palindrome");
        else
            System.out.println(s+" is not a palindrome");
    }
}
