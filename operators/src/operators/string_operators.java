package operators;

public class string_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="nevuri";
String t="manasa";
String u="reddy";
System.out.println(s.concat(t));
System.out.println ((s.concat(t)).concat(u));
System.out.println("n"+" "+t);
System.out.println('a'+3);// addition,it is taking ascii value of a
System.out.println("a"+10);//here a is considered as a charecter
System.out.println(s+'a'+20);//middle no ascii value access
System.out.println(s+"a"+20);//middle 
System.out.println(20+'a');//both as values
System.out.println('a'+20);//both as values
System.out.println(20+'a'+t);//dition and then concat
System.out.println(20+'a');

//if we give the ascii and numerical initially,it will be added,
// the end it will not get added



	}

}
