package batcave;

abstract class Robin{      //abstract class
	
	//abstract method
	abstract void robin();
}

class FirstRobin extends Robin{
	
	@Override
	void robin() {
		//First Robin Implementation
		System.out.println("I'm Dick Grayson the first robin and currently Nightwing");
	}
}

class SecondRobin extends Robin{
	
	@Override
	void robin() {
		//Second Robin Implementation
		System.out.println("I'm Jason Todd the second robin and currently Red Hood");
	}
}

class ThirdRobin extends Robin{
	
	@Override
	void robin() {
		// Third Robin Implementation
		System.out.println("I'm Tim Drake the third robin and currently Red Robin");
	}
}

class FourthRobin extends Robin{
	
	@Override
	void robin() {
		// Fourth Robin Implementation
		System.out.println("I'm Damian Wayne the fourth and current Robin");	
	}
}
public class AbstractionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstRobin firstRobin=new FirstRobin();
		firstRobin.robin();
		
		SecondRobin secondRobin=new SecondRobin();
		secondRobin.robin();
				
		ThirdRobin thirdRobin=new ThirdRobin();
		thirdRobin.robin();
		
		FourthRobin fourthRobin=new FourthRobin();
		fourthRobin.robin();

	}

}
