package batcave;

interface First{
	default void firstMethod() {
		System.out.println("This is first default method called by object of concrete class");
	}
	default void secondMethod() {
		System.out.println("second default method acccessed by super method and interface name");
	}
	
	
	static void TheStaticMethod() {
		System.out.println("This is static method called by interface name");
	}
}



public class AccessingMethodsOfInterface implements First{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessingMethodsOfInterface access = new AccessingMethodsOfInterface();
		access.firstMethod();
		access.secondMethod();
		First.TheStaticMethod();
		

	}

}
