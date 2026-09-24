package batcave;

class Normal{
	interface MyInterface{
		void show();
	}
}
class Nest implements Normal.MyInterface{ //accessing interface using the class name in which the interface is present 

	@Override
	public void show() { //giving implementation to the method present into the interface.
		// TODO Auto-generated method stub
		System.out.println("This is a nested interface");
	}
}

public class NestedInterface{
	public static void main(String[] args) {
		Nest nest=new Nest();
		nest.show(); //calling the implemented interface method 
	}
}