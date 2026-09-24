package batcave;

public class StringClassMethodsWorking {

	public static void main(String[] args) {
		
		
		//length()
		System.out.println("Method 1: length()");
		String s1="Michael";
		System.out.println(s1.length());
		System.out.println();
		
		//charAt()
		System.out.println("Method 2: charAt()");
		String s2="Victor";
		System.out.println(s2.charAt(3));
		System.out.println();
		
		//substring(start,end) --> start index include, end index exclude
		System.out.println("Method 3: substring(start, end)");
		String s3="Scofield";
		System.out.println(s3.substring(0, 4));
		System.out.println();
		
		//equals() --> Output in boolean  { string1.equals(string2) }
		System.out.println("Method 4: equals()");
		String s4x1="Java";
		String s4x2="JAVA";
		String s4x3="Java";
		System.out.println(s4x1.equals(s4x2));  //False becasue it is case sensitive
		System.out.println(s4x1.equals(s4x3));
		System.out.println();
		
		//equalsIgnoreCase() --> Boolean Output same syntax but not case sensitive
		System.out.println("Method 5: equalsIgnoreCase()");
		String s5x1="Michael";
		String s5x2="MICHAEL";
		String s5x3="michael";
		System.out.println(s5x1.equalsIgnoreCase(s5x2));
		System.out.println(s5x1.equalsIgnoreCase(s5x3));
		System.out.println(s5x2.equalsIgnoreCase(s5x3));
		System.out.println();
		
		//compareTo() --> { s1.compareTo(s2) }, compares in dictionary order so 0 for equal, 1 for 1st string comes before, -1 for second string comes before
		System.out.println("Method 6: compareTo()");
		String s6x1="Michael";
		String s6x2="Linclon";
		System.out.println(s6x1.compareTo(s6x2));  //here L comes before M so output 1
		System.out.println(s6x2.compareTo(s6x1));  //here M comes after L so output -1
		System.out.println();
		
		//contains() --> Boolean Output
		System.out.println("Method 7: contains()");
		String s7="Spring Boot";
		System.out.println(s7.contains("Boot"));
		System.out.println();
		
		//startsWith() --> Boolean Output
		System.out.println("Method 8: startsWith()");
		String s8="Prison";
		System.out.println(s8.startsWith("Pr"));
		System.out.println();
		
		//endsWith() --> Boolean Output
		System.out.println("Method 9: endsWith()");
		String s9="Break";
		System.out.println(s9.endsWith("eak"));
		System.out.println();
		
		//indexOf() --> Returns index of the particular character { string1.indexOf(character) }
		System.out.println("Method 10: indexOf()");
		String s10="Theodore";
		System.out.println(s10.indexOf('o'));  //Note: It always gives first appearance index.
		System.out.println();
		
		//lastIndexOf() --> Returns last appearance index of the character 
		System.out.println("Method 11: lastIndexOf()");
		String s11="Theodore";
		System.out.println(s11.lastIndexOf('o'));  //last appearance index = 5
		System.out.println();
		//Note: Both indexOf and lastIndexOf are case sensitive and if the character is not present it gives -1 output.
		
		//replace() --> { string1.replace(old,new) } replaces all appearances of that character
		System.out.println("Method 12: replace()");
		String s12="Banana";
		System.out.println(s12.replace('a','o'));
		System.out.println();
		//Note: if the old character mentioned is not present into string, it doesn't show error
		//instead it returns the original string without change.
		
		//toUpperCase()
		System.out.println("Method 13: toUpperCase()");
		String s13="lincoln";
		System.out.println(s13.toUpperCase());
		System.out.println();
		
		//toLowerCase()
		System.out.println("Method 14: toLowerCase()");
		String s14="LINCOLN";
		System.out.println(s14.toLowerCase());
		System.out.println();
		
		//trim()
		System.out.println("Method 15: trim()");
		String s15="   Prison   Break   ";
		System.out.println(s15.trim());   //trims spaces before and after the string, not within the string
		System.out.println();
		
		//isEmpty() --> Boolean Output
		System.out.println("Method 16: isEmpty");
		String s16x1=" ";
		String s16x2="";
		System.out.println(s16x1.isEmpty());  //false =  space is also considered as character
		System.out.println(s16x2.isEmpty());  //true 
		System.out.println();
		
		//isBlank() --> Boolean Output. This method is from Java 11
		System.out.println("Method 17: isBlank()");
		String s17x1="      ";
		String s17x2="";
		System.out.println(s17x1.isBlank()); //true
		System.out.println(s17x2.isBlank()); //true
		System.out.println();
		//both blank space and no character are considered as empty
		
		//concat() { s.concat(s1) }
		System.out.println("Method 18: concat()");
		String s18x1="Michael";
		String s18x2=" Scofield";
		System.out.println(s18x1.concat(s18x2));
		System.out.println();
		
		//split()
		System.out.println("Method 19: split()");
		String s19="Theodore Bagwell,Michael Scofield,Alexander Mahone,Sucre,Lincoln Burrows";
		String[] stringArray=s19.split(",");
		
		for(String persons: stringArray) {
			System.out.println(persons);
		}
		System.out.println();
		
		
		//toCharArray() --> Breaks the string into individual characters
		System.out.println("Method 20: toCharArray()");
		String s20="TMNT";
		char[] characterArray=s20.toCharArray();
		
		for(char split: characterArray) {
			System.out.println(split);
		}
		System.out.println();
		
		
		//repeat() --> Java 11, Repeats the string to desired number
		System.out.println("Method 21: repeat()");
		String s21="Mayday!...";
		
		System.out.println(s21.repeat(3));
		System.out.println();
	}
}