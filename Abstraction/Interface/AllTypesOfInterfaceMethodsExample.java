package batcave;

interface Troubles{
	
	void change();                                 //abstract method
	
	default void people() {                        //default method
		System.out.println("People Disappoint");
		god(); //private method called
	}
	
	static void life() {    		                                           //static method
		System.out.println("Life is Hard");
		god(); //private method called    	
	}
	
	private static void god() {                   //Private method (static) 		                                         
		                                          //private static because static method can't access private instance method
		System.out.println("But, God is Good");
	}
}

class Truth implements Troubles{
	
	@Override
	public void change() {
		// Custom implementation for abstract method
		System.out.println("Change is the only constant");
	}
	
}

public class AllTypesOfInterfaceMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truth truth=new Truth();
		
		truth.change();   //calling abstract method
		truth.people();   //calling default method
		Troubles.life();  //calling static method
	}

}
