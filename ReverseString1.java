package stringsPractice;

public class ReverseString1 {
    public static void main(String[] args) {
        String s="hello";
        char[] c=s.toCharArray();  //converted string to character array
        int left=0;
        int right=c.length-1;

        while(left<right){
        char temp=c[left];
        c[left]=c[right];
        c[right]=temp;
        left++;
        right--;
        }
        //using reverse array technique, we reversed the char array

        System.out.println(c);
    }
}
