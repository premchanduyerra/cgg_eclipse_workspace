package Agregation;
public class Employee {
	String name;
	int id;
	Address address;
	public Employee(int id,String name,Address address) {
		this.address=address;
		this.id=id;
		this.name=name;
				
	}
	
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address a1=new Address("prem","jsgda","sakjashd");
		
		Employee e1=new Employee(1,"hjh",a1);
e1.display();
		
	}

}
