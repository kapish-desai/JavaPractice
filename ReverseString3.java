package stringsPractice;

public class ReverseString3 {
    public static void main(String[] args) {
        String s="Brand New Day";
        StringBuilder reverseString=new StringBuilder(); //used StringBuilder it would be easy to modify, it is mutable

        for (int i=s.length()-1;i>=0;i--){
            reverseString.append(s.charAt(i));
        }
        System.out.println(reverseString);
    }
}
