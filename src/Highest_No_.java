
public class Highest_No_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[]={10,80,70,500,100,12};//80,500,
		int largest=array1[0];
		int secondlargest=0;
		
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]>largest)
			{
				largest=array1[i];
				secondlargest=largest-array1[array1.length-1];
			}
			
		}
		System.out.println(largest+"given no is largest");
		System.out.println(secondlargest+"given no is secondlargest");
 
	}

}
