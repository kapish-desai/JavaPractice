package batcave;

interface ChemistryTeacher{
	
	void teach();
}

interface DrugLord{
	
	void cook();
}

class White implements ChemistryTeacher, DrugLord{
	
	@Override
	public void teach() {
		System.out.println("Walter White teaches chesmistry");
	}
	
	@Override
	public void cook() {
		System.out.println("Heisenberg cooks meth");
	}
} 
public class MultipleInheritanceUsingInterfacesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		White white=new White();
		white.teach();
		white.cook();
		

	}

}
