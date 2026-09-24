package batcave;

class Parent{
	
	public Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("This is Parent Constructor");
	}
}

class Child extends Parent{
	
	public Child() {
		System.out.println("This is Child Constructor");
	}
	
	//Child constructor will automatically call Parent constructor 
	//super() is automatically called.
}


public class ConstructorChainingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c=new Child();
		

	}

}
