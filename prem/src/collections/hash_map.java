package collections;
import java.util.*;  
public class hash_map 
{
	 public static void main(String args[]){  
	   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
	   map.put(1,"jyo");  //Put elements in Map  
	   map.put(2,"D");    
	   map.put(3,"DB");   
	   map.put(4,"R");   
	      
	   for(Map.Entry m : map.entrySet())
	   {    
		   System.out.println(m.getValue());  
		   System.out.println();
	    System.out.println(m.getKey()+" "+m.getValue());    
	    System.out.println();
	   }  
	} 
	 
}  
	
	
