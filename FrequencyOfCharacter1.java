package stringsPractice;

public class FrequencyOfCharacter1 {
    public static void main(String[] args) {
        // count frequency of target character in the string
        //count frequency of 'a' in "banana"
        String s="banana";
        char target='a';
        int frequency=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==target)
                frequency++;
        }
        System.out.println("Frequency of "+target+" in String "+s+"= "+frequency);
    }
}
