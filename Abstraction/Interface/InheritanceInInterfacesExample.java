package batcave;

interface Genius{
	void genius();
}

interface Billionaire extends Genius{
	void billionaire();
}

interface PlayBoy extends Billionaire{
	void playboy();
}

interface Philanthropist extends PlayBoy{
	void philanthropist();
}

interface TonyStark extends Philanthropist{
	void tonyStark();
}

class Ironman implements TonyStark{
	//concrete class which inherits the latest interface and gets access all previous interface methods
	
	@Override
	public void genius() {
		System.out.println("Genius");
	}
	
	@Override
	public void billionaire() {
		System.out.println("Billionaire");
	}
	
	@Override
	public void playboy() {
		System.out.println("Playboy");
	}
	
	@Override
	public void philanthropist() {
		System.out.println("Philanthropist");
	}
	
	@Override
	public void tonyStark() {
		System.out.println("Tony Stark");
	}
	
	public void ironman() {
		System.out.println("I'm Ironman");
	}
}
public class InheritanceInInterfacesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ironman ironman=new Ironman();
		ironman.genius();
		ironman.billionaire();
		ironman.playboy();
		ironman.philanthropist();
		ironman.tonyStark();
		ironman.ironman();

	}

}
