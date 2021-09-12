package wrapper_class;

public class example_double {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double d=20;
		System.out.println("printing value and converted object value");
		System.out.println("initial value is   "+d);
		Double  obj =d;
		System.out.println("object value is   "+obj);
		//unboxing (object to datatype)
		System.out.println("printing object and converted value");
		double value=obj;
		System.out.println("value is   "+value);
		System.out.println();
	}

}
