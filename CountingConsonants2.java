package stringsPractice;

public class CountingConsonants2 {
    public static void main(String[] args) {
        //type 2
        String s="The Ultimate Nullifier For Fantastic 4 Yooo!!!!!! 777";
        int count=0;
        String vowels="aeiou";
        String x=s.toLowerCase();

        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(Character.isLetter(c) && vowels.indexOf(c)==-1)
                count++;

            //what happened here
            //Character.isLetter() checks if the character is a letter or alphabet
            //if it is a letter then it searches it in 'vowels' string
            //if the character is present in vowels string it will return its index in string
            //if not, it will return -1
            //whenever the conditions present into 'if' return -1 then the value of count increases
            //this will help us determine the number of consonants in the String
        }
        System.out.println("Consonants count in "+s+"= "+count);
    }
}
