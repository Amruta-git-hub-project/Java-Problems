
public class Multiplication_Pyramid {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int n=5;
		int k=0;
		for(int i=0; i<=n;i++)
		{
			for(int j=0; j<=i;j++) 
			{
				k=k+2; 
				System.out.print(k+ " ");
			}
			System.out.println();
		}

	}

}


/*o/p
2
4  6
10 12 14
16 18 20 22

*/