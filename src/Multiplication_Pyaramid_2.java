
public class Multiplication_Pyaramid_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k;
		int m=0;
		
		
		for(int i=0;i<=n;i++)
		{ 
		
			m++;
			for(int j=0;j<=i;j++)
			{
				
				System.out.print(" "+m);
				
			}
			
			System.out.println(); 
		}
		 
	}

}

/* o/p  
1
6	2
10 	7	3
13 	11	8	4 
15  14	12	9	5


*/