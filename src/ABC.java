
public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=69;
		int n=0;
		
		for(int i=5;i>=1;i--)
		{
			for(int j=0;j<i;j++)
			{	
				 n= k+j;
				System.out.print((char)n +" ");
				
			} 
		
			System.out.println();
			k--;
			
		}
		
	}

}


/*
E F G H I
D E F G 
C D E 
B C
A
*/