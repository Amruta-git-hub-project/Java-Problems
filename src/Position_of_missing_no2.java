import java.util.ArrayList;
import java.util.List;

public class Position_of_missing_no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]={5,7,8,8,10};
		
		Find_missing_no(arr1);
	}
	
	public static void Find_missing_no(int array1[])
	{
		//Find the largest element from arraylist//
		List<Integer>list1= new ArrayList<Integer>();
		int largest=array1[0];
		for(int i=0;i<array1.length;i++)
		{
			list1.add(array1[i]);

			if(largest<array1[i])
			{
				largest=array1[i];

			}
			
		}
		
		System.out.println(largest+"laregest"+list1+"list1");
		
		List<Integer>list2=new ArrayList<Integer>();
		for(int j=0;j<=largest;j++)
		{
			if(!list1.contains(j))
			{
				list2.add(j);
			}
		}
		System.out.println("missing no"+list2);

		
	}

}
