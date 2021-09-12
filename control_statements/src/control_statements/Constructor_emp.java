package control_statements;

public class Constructor_emp {
	int id;
	String name;
	int salary;
	Constructor_emp(int i,String n,int s)
	{
		id=i;
		name=n;
		salary=s;
	}
	void display()
	{
		System.out.println(id+""+name+""+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor_emp obj=new Constructor_emp(1,"prem",25);
		obj.display();
	}

}
