package arrays;

import java.util.*;

public class Array_subtraction {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter no.of rows for matrix 1");
	int p=s.nextInt();
	System.out.println("enter no.of columns for matrix 1");
	int q=s.nextInt();
	System.out.println("enter no.of rows for matrix 2");
	int m=s.nextInt();
	System.out.println("enter no.of columns for matrix 2");
	int n=s.nextInt();
	int a[][]=new int[p][q];
	int b[][]=new int [m][n];
	int c[][]=new int [p][q];
	if(p==m && q==n)
	{

	System.out.println("enter elements for matrix1");
	for(int i=0;i<p;i++)
	{
		for (int j=0;j<q;j++)
		{
			a[i][j]=s.nextInt();
			
		}
	}
	System.out.println("the elements of matrix1 are");
	for (int i=0;i<p;i++)
	{
		for(int j=0;j<q;j++)
		{
			System.out.print(a[i][j]+" ");
		}
			System.out.println("");
	}
	System.out.println("enter elements for matrix2");
	for(int i=0;i<p;i++)
	{
		for (int j=0;j<q;j++)
		{
			b[i][j]=s.nextInt();
			
		}
	}
	System.out.println("the elements of matrix2 are");
	for (int i=0;i<p;i++)
	{
		for(int j=0;j<q;j++)
		{
			System.out.print(b[i][j]+" ");
		}
			System.out.println("");
	}

	for(int i=0;i<p;i++)
	{
		for (int j=0;j<q;j++)
		{
			c[i][j]=a[i][j]-b[i][j];
			
		}
	}
	System.out.println("final elements are");
	for (int i=0;i<p;i++)
	{
		for(int j=0;j<q;j++)
		{
			System.out.print(c[i][j]+" ");
		}
			System.out.println("");
	}
	}
	else
	{
		System.out.println("subtraction is  not possible");
	}

		}

	}
