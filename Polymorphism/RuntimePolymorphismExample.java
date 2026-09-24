package batcave;

class BatFamily{
	
	//origial method
	public void member() {
		System.out.println("Bruce Wayne - Batman");
	}
}

class DickGrayson extends BatFamily{
	
	//overriding the method and giving custom implementation
	@Override
	public void member() { 
		System.out.println("Dick Grayson - Nightwing (1st Robin)");
	}
}

class JasonTodd extends BatFamily{
	
	//overriding the method and giving custom implementation
	@Override
	public void member() {
		System.out.println("Jason Todd - Red Hood (2nd Robin)");
	}
}

class TimDrake extends BatFamily{
	
	//overriding the method and giving custom implementation
	@Override
	public void member() {
		System.out.println("Tim Drake - Red Robin (3rd Robin)");
	}
}

class Damian extends BatFamily{
	
	//overriding the method and giving custom implementation
	@Override
	public void member() {
		System.out.println("Damian Wayne - Robin (Current Robin)");
	}
}

public class RuntimePolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BatFamily batFamily;
		
		batFamily=new BatFamily();
		batFamily.member();
		
		batFamily=new DickGrayson(); //parent reference and child object
		batFamily.member();
		
		batFamily=new JasonTodd(); //parent reference and child object
		batFamily.member();
		
		batFamily=new TimDrake(); //parent reference and child object
		batFamily.member();
		
		batFamily=new Damian(); //parent reference and child object
		batFamily.member();
	}

}
