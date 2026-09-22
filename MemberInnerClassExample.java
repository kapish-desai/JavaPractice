package batcave;
class Nolan{   //outer class
	
	static String movieName="The Odyssey";  //static member
	long year=2026;                         // non-static member 
	
	class Movie{   //inner class (non static)
		
		public void details() {
			System.out.println("Movie Name : "+movieName); //directly accessing static member
			System.out.println("Release Date : "+year);            // directly accessing non static memner
		}
	}
}
public class MemberInnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nolan nolan=new Nolan();  //outer class object creation first
		
		//inner class object creation
		Nolan.Movie movie = nolan.new Movie();  //this is proper syntax
		movie.details();

	}

}
