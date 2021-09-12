package arrays;

public class Rotation_of_array_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
int temp=a[4];
for(int i=4;i>=0;i--)
		{
	a[i]=a[i-1];
	a[0]=temp;
}
for (int i=0;i<5;i++)
{
	System.out.println(a[i]);
}
	}

}
