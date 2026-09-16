package stringsPractice;

public class CountingVowels2 {
    public static void main(String[] args) {
        //type 2
        String s="JAva PrOgrmmIng";
        String x=s.toLowerCase();
        int count =0;
        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                count++;
        }
        System.out.println("Vowel count in "+s+"="+count);
    }
}
