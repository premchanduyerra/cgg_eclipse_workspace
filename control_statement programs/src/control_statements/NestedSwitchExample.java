package control_statements;

import java.util.Scanner;

public class NestedSwitchExample {

	 public static void main(String args[])  
     {  
     //C - CSE, E - ECE, M - Mechanical  
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter branch with one charecter");
		 char branch=s.next().charAt(0);
		 System.out.println("enter college year");
		int collegeYear=s.nextInt();
       //char branch = 'C';                 
       //int collegeYear = 4;  

		switch( collegeYear )  
       {  
           case 1:  
               System.out.println("English, Maths, Science");  
               break;  
           case 2:  
               switch( branch )   
               {  
                   case 'c':  
                       System.out.println("Operating System, Java, Data Structure");  
                       break;  
                   case 'e':  
                       System.out.println("Micro processors, Logic switching theory");  
                       break;  
                   case 'm':  
                       System.out.println("Drawing, Manufacturing Machines");  
                       break;  
               }  
               break;  
           case 3:  
               switch( branch )   
               {  
                   case 'c':  
                       System.out.println("Computer Organization, MultiMedia");  
                       break;  
                   case 'e':  
                       System.out.println("Fundamentals of Logic Design, Microelectronics");  
                       break;  
                   case 'm':  
                       System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                       break;  
               }  
               break;  
           case 4:  
               switch( branch )   
               {  
                   case 'c':  
                       System.out.println("Data Communication and Networks, MultiMedia");  
                       break;  
                   case 'e':  
                       System.out.println("Embedded System, Image Processing");  
                       break;  
                   case 'm':  
                       System.out.println("Production Technology, Thermal Engineering");  
                       break;  
               }  
               break;  
       }  
   }  
}