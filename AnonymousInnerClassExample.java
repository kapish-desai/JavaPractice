package batcave;

interface  Animal {
	void sound(); 		
}

class Car{
	public void engine() {
		System.out.println("Car Engine");
	}
}

public class AnonymousInnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Anonymous inner class using interface
		Animal a=new Animal(){
			public void sound() {
				System.out.println("Dog Barks");
			}
		};
		a.sound();
		
		
		//Anonymous inner class using class
		Car c=new Car() {
			public void engine() {
				System.out.println("V8 engine");
			}
		};
		c.engine();
		

	}

}
