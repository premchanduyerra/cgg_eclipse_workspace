package arrays;
import java.util.*;
import java.lang.Math;
public class Rotation_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,153,212,370},r=0;
int count=0;
double sum=0;
for(int i=0;i<=5;i++)
{
		count=0;
 
		int num=a[i];
		
		
		while(num!=0)
		{
	    num=num/10;
	    count =count+1;
		}
	    //System.out.println(count);
	    num=a[i];
	    sum=0;
	    while (num>0)
	    {
	    
	    int rem=num%10;
	    //System.out.println(rem);
	    sum=sum+(Math.pow(rem,count));
	    num=num/10;
	    
	    }
	    if(sum==a[i])
	    {
	    	System.out.println("arm   "+a[i]);
	    	
	    }
	    else
	    {
	    	System.out.println("no");
	    }
	   
}


	}

}
