package batcave;

class Symbiote{
	
	public void bond() {
		System.out.println("Symbiote Bonded");
	}
}

class Host{
	
	Symbiote symbiote;
	
	public Host() {
		// TODO Auto-generated constructor stub
		symbiote=new Symbiote();
	}
	
	public void life() {
		symbiote.bond();
		System.out.println("Host Found");
	}
}
public class Composition_HAS_A_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Host host=new Host();
		host.life();

	}

}
