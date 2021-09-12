package Constructor_examples;

public class ex1 {

	int id;
	String name;
ex1()
{
	System.out.println("default constructor");
}
ex1(int i)
{
	 id=i;
	//System.out.println(id);
}
ex1(int i,String n)
{
   id=i;
	 name=n;
	 //System.out.println(id+"     man0j");
}
void display()
{
	System.out.println(id+"    "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

ex1 ex=new ex1();//to call the  default constructor
ex1 ex2=new ex1(10);//one parameter constructor calling
ex1 ex3=new ex1(20,"manasa");//two parameter constructor calling
//ex.id=10;//to change the values globally
//ex2.id=10;//otherwise the variables will take default values
ex.display();//default values will be displayed
ex2.display();
ex3.display();//to get values you need to give by using object.variable
}

}
