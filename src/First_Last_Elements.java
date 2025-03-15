import java.util.HashSet;
import java.util.Set;

public class First_Last_Elements {
	
	/*Finding first and last element position
	 * 
	 * i/p={5,3,6,7,9}
	 * find 6 & 7 elemenet position
	 * o/p=[2,3]
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,3,6,7,9};
		Finding_Position(arr);
	}
	
	public static void Finding_Position(int arr[])
	{
		Set<Integer>set= new HashSet<Integer>();
		Set<Integer>set1= new HashSet<Integer>();

		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
			if(arr[i]==6)
			{
			 set1.add(i);
			}
			if(arr[i]==7)
			{
				 set1.add(i);

			}
		}
		System.out.println(set1 +"Position of element");
		
	}

}
