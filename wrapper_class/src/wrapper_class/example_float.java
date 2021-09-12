package wrapper_class;

public class example_float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f=30.0F;
		//autoboxing(datatype to object)
		System.out.println("printing value and converted object value");
		System.out.println("initial value is   "+f);
		Float  obj =f;
		System.out.println("object value is   "+obj);
		//unboxing (object to datatype)
		System.out.println("printing object and converted value");
		float value=obj;
		System.out.println("value is   "+value);
		System.out.println();
	}

}
