package stringsPractice;

public class RemoveDuplicates3 {
    public static void main(String[] args) {
        String s="odnogo ultrafunk legendaris remix";
        StringBuilder result=new StringBuilder(); //StringBuilder object creation

        for (int i=0;i<s.length();i++){
            String character=String.valueOf(s.charAt(i));
            //instead of converting char to String in if condition bracket
            //we converted it here itself and stored it in String type
            if (result.indexOf(character)==-1)
                result.append(character);
            //what happened here
            //the 'indexOf()' checks if the 'character' is present into it
            //if not present it returns '-1'
            //but the if condition only works for boolean conditions
            // so we wrote the condition in such way, "result.append(character)==-1" becomes true because '==' checks the value of both sides
            // result.append(character)==-1 then becomes true and if block executes
            //where the StringBuilder result is modidfied using append()
        }
        System.out.println("Original : "+s);
        System.out.println("Modified: "+result);

    }
}
