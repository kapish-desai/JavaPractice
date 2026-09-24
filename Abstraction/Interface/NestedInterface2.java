package batcave;

import batcave.Second.FirstInter;

class Second{
	interface FirstInter{
		public void firstInterface();
		
		interface SecondInter{
			public void secondInterface();
		} 
	}
}

class ImplementerClass implements Second.FirstInter, FirstInter.SecondInter{ //implementing multiple interfaces (Multiple Inheritance)
	
	@Override
	public void firstInterface() {
		// TODO Auto-generated method stub
	System.out.println("This is first nested interface which is in class");	
	}
	
	@Override
	public void secondInterface() {
		// TODO Auto-generated method stub
	System.out.println("This is second nested interface which is in first interface");	
	}
}
public class NestedInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementerClass impl=new ImplementerClass();
		impl.firstInterface();
		impl.secondInterface();
	}

}
