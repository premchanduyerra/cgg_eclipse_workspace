package wrapper_class;

public class Example_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='m';
		//autoboxing(datatype to object)
		System.out.println("printing value and converted object value");
		System.out.println("initial value is   "+ch);
		Character obj =ch;
		System.out.println("object value is   "+obj);
		//unboxing (object to datatype)
		System.out.println("printing converted value");
		char value=obj;
		System.out.println("value is   "+value);
		System.out.println();
	}

}
