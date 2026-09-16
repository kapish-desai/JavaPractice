package stringsPractice;

public class FrequencyOfCharacter2 {
    public static void main(String[] args) {
        //frequency of 'm' in programming
        String s="programming";
        char target='m';
        int frequency=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.compare(c,target)==0)
                frequency++;
        }
        System.out.println("Frequency of "+target+" in String "+s+"= "+frequency);
    }

}
