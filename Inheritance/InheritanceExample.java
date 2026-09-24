package batcave;

class Wayne{
	
	public void superpower() {
		System.out.println("I'm Rich");
	}
	
}

class ThomasWayne extends Wayne{
	
	public void title() {
		System.out.println("Flashpoint Batman");
	}
}

class BruceWayne extends Wayne{
	
	public void title() {
		System.out.println("Batman");
	}
}

class DamianWayne extends Wayne{
	
	public void title() {
		System.out.println("Damian Wayne");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThomasWayne thomasWayne=new ThomasWayne();
		BruceWayne bruceWayne=new BruceWayne();
		DamianWayne damianWayne=new DamianWayne();
		
		thomasWayne.title();
		thomasWayne.superpower();
		System.out.println();
		
		bruceWayne.title();
		bruceWayne.superpower();
		System.out.println();
		
		damianWayne.title();
		damianWayne.superpower();
		System.out.println();

	}

}
