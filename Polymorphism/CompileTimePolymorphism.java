package batcave;
class Charmer{
	public int Add(int a, int b) {
		return a+b;
	}
	public int Add(int a, int b, int c) {
		return a+b+c;
	}
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charmer c=new Charmer();
		System.out.println(c.Add(2, 3));
		System.out.println(c.Add(2, 3, 4));

	}

}
