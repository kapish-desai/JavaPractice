package batcave;

class Ogygia{
	
	static String name="Kaniel Outis";
	int num=3;
	
	public void prison() {
		
		class FoxRiver{
			String originalName="Micheal Scofield";
			int n=1;
			
			public void disp() {
				System.out.println("False Identity: "+name+" prison number: "+num);
				System.out.println("Real Identity: "+originalName+" prison number: "+n);
			}
		}
		
		FoxRiver foxRiver=new FoxRiver();
		foxRiver.disp();
	}
}
public class LocalInnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ogygia ogygia=new Ogygia();
		ogygia.prison();

	}

}
