package arrays;

public class ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//datatype variable[]=new datatype [size];
int a[]={1,3,4,6,7};// new keyword for declaration and instantiate
int i;
//int even[]=new int[5];

//int odd[]=new int[5];
System.out.println("even are");	
for (i=0;i<a.length;i++)
{
	if(a[i]%2==0)
	{
	
	System.out.println(a[i]);
	}
}
System.out.println("odd are");	
for (i=0;i<a.length;i++)
{	
	if(a[i]%2!=0)
	{
	//even[]=even[]+a[i];
	System.out.println(a[i]);
	}
}



	}

}
