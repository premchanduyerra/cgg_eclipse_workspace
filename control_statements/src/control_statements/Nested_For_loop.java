package control_statements;

public class Nested_For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		for (i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				if(j==i)
				{
					continue;
				}
				System.out.println(i+""+j);
			
			}
			
		}

	}

}
