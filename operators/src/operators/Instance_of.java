package operators;

public class Instance_of {
	
	void ddd(Object ob) {
		System.out.println(ob instanceof Object);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String();
		
		Instance_of s2=new Instance_of();
		s2.ddd("aa");
		String i="aa";
		System.out.println(i instanceof Object);
		
		
	}

}
