package batcave;


class Serum{
	
	
	
	public void serum() {
		System.out.println("Super Soldier Serum");
	}
}

class SteveRogers extends Serum{
	
	public void inject() {
		System.out.println("I have super soldier serum");
	}
}

public class AllTypesOfCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reference Type Casting
		
		Serum serum=new SteveRogers(); //Upcasting (implicit)
		
		if(serum instanceof SteveRogers) {
			SteveRogers steveRogers=(SteveRogers) serum; //Downcasting (explicit)
			steveRogers.serum();
			steveRogers.inject();
		}
		
		System.out.println();
		
		//Primitive Type Casting
		int a=100;
		double b=a; //Widening (implicit)
		System.out.println("int "+a+" converted to double "+b);
		
		double c=12.34;
		int d=(int) c; // Narrowing (explicit)
		System.out.println("double "+c+" converted to int "+d+" it lost the numbers after decimal");
		
	

	}

}
