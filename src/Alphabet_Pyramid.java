
public class Alphabet_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String abc="ABCDE";
		int k=66;
		//System.out.print((char)65); // prints A
		for(int i=5; i>=1;i--)
		{ 
			for(int j=0;j<i;j++) 
			{
				int n=k+j;
				System.out.print((char)n +" ");

				//System.out.print(abc.charAt(j)+" ");
			}
			System.out.println();
		} 
	}

}
