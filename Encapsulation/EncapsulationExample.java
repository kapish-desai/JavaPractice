package batcave;


class Demo{
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		
		if(age>0)
			this.age=age;
		
		else
			System.out.println("Invalid Age");
	}
	
	public int getAge() {
		return age;
	}
	
	
}
public class EncapsulationExample {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		
		d1.setAge(22);
		d1.setName("Kapish");
		
		System.out.println(d1.getName()+" "+d1.getAge());
		
		
		Demo d2=new Demo();
		
		d2.setAge(21);
		d2.setName("Sumedh");
		
		System.out.println(d2.getName()+" "+d2.getAge());
	}
}
