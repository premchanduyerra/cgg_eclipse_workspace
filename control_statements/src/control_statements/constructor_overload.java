package control_statements;

public class constructor_overload {
int id;
String name;
int salary;
constructor_overload(int i)
{
	id=i;
}
constructor_overload(int j,String n)
{
	id=j;
	name=n;
	
}
constructor_overload(int j,String n,int s)
{
	id=j;
	name=n;
	salary =s;
}
void display1()
{
	System.out.println(id);
}
void display2()
{
	System.out.println(id+""+name);
}
void display3()
{
	System.out.println(id+""+name+""+salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor_overload obj1= new constructor_overload(1);
		constructor_overload obj2=new constructor_overload(2,"mansa");
		constructor_overload obj3=new constructor_overload(3,"manoj"+25000);
		obj1.display1();
		obj2.display2();
		obj3.display3();
	}

}
