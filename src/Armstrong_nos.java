
public class Armstrong_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=153;
		int temp=number;
		int sumofcube=0;
		
		while (number>0)
		{
			int a=number%10;// last digit will get added in int a; 3,5,1
			number=number/10;// eliminate last digit number ; 15,1
			
			sumofcube=sumofcube+(a*a*a);
			
			if(temp==sumofcube)
			{
				System.out.println(temp+"its armstrong");
			}
			else
			{
				System.out.println(temp+"its not an armstrong");
			}  
		}

	}

}
