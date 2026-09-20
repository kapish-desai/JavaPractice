package stringsPractice;

public class RemoveBlankSpaces1 {
    public static void main(String[] args) {
        String s="Java is easy";
        String x=s.replace(" ",""); //replace the blank spaces with nothing, no space
        System.out.println("Old: "+s);
        System.out.println("New: "+x);
    }
}
