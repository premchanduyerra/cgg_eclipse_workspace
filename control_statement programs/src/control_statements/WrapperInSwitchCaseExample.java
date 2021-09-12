package control_statements;
import java.util.*;
public class WrapperInSwitchCaseExample {

	 public static void main(String args[])  
     {    Scanner s=new Scanner(System.in);
     	  System.out.println("enter age");
     	  int i=s.nextInt();
     	  Integer age = i;        
          switch (age)  
          {  
              case (16):            
                  System.out.println("You are under 18.");  
                  break;  
              case (18):                
                  System.out.println("You are eligible for vote.");  
                  break;  
              case (65):                
                  System.out.println("You are senior citizen.");  
                  break;  
              default:  
                  System.out.println("Please give the valid age.");  
                  break;  
          }             
      }  
}