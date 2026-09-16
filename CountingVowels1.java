package stringsPractice;

public class CountingVowels1 {
    public static void main(String[] args) {
        //type 1
        String s="education";
        int count=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                count++;
        }
        System.out.println("Vowel count in "+s+"="+count);
    }
}
