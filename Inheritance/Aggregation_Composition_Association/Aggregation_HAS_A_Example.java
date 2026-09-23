package batcave;

class Prison{
	
	String prisonName;
	
	public Prison(String pn) {
		// TODO Auto-generated constructor stub
		this.prisonName=pn;
	}
}

class Inmate{
	
	String inmateName;
	Prison prison;
	
	public Inmate(String inmate, Prison p) {
		this.inmateName=inmate;
		this.prison=p;
	}
	
	public void display() {
		System.out.println(inmateName+" "+prison.prisonName);
	}
}
public class Aggregation_HAS_A_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prison prison=new Prison("Fox River");
		
		Inmate i=new Inmate("Michael Scofield", prison);
		Inmate ii=new Inmate("Fernando Sucre", prison);
		Inmate iii=new Inmate("Lincoln Burrows", prison);
		Inmate iv=new Inmate("Theodore Bagwell", prison);
		
		i.display();
		ii.display();
		iii.display();
		iv.display();

	}

}
