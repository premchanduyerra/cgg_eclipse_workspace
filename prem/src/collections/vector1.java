package collections;
import java.util.*;  
public class vector1

{
	public static void main(String args[]){  
	Vector<String> v=new Vector<String>();  
	v.add("j");  
	v.add("y");  
	v.add("o");  
	v.add("b");  
	Iterator<String> itr=v.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	} 


