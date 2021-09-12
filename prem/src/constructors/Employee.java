package constructors;

public class Employee {
	int Age,Id,Marks;
	String Name;
	
	Employee(int id,String name,int age){
		Id=id;
		Name=name;
		Age=age;
	}
	Employee(int id,String name,int age,int marks){
		Id=id;
		Name=name;
		Age=age;
		Marks=marks;
	}
	Employee(){
		Id=1;
		Name="prem";
	}
	
	void display() {
		System.out.println("id:"+Id);
		System.out.println("Name:"+Name);
		System.out.println("Age:"+Age);
		System.out.println("Marks:"+Marks);
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=new Employee(1,"prem",21);
		em.display();
		
		
		Employee em2=new Employee();
		em2.display();
		
		Employee em3=new Employee(3, "kumar",21,111);
		em3.display();

	}

}
