package ThisKeyword;

public class Employe {

	String name;
	int age;
	
	public Employe(int age,String name) {
		this.name=name;
		this.age=age;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getname() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe e1=new Employe(12,"prem");
		System.out.println(e1.getAge());
		e1.setName("jyo");
		System.out.println(e1.getname());
	}

}
