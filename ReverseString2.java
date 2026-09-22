package stringsPractice;

public class ReverseString2 {
    public static void main(String[] args) {
        String s="LANTERNS";
        String reverse=""; //empty String created

        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        System.out.println(reverse);
    }
}
