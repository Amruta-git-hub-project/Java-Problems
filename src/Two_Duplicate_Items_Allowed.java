import java.util.ArrayList;
import java.util.List;

public class Two_Duplicate_Items_Allowed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]={0,0,1,1,1,1,1,2,3,3,3};
		//Remove_two_dupli_Ele_minus(arr1);
		Remove_two_dupli_Ele_add(arr1);

		

	}
	public static void Remove_two_dupli_Ele_minus(int arr1[])
	{
		int count=1;
		List<Integer>list1= new ArrayList();
		list1.add(arr1[0]);
		for(int i=1;i<arr1.length;i++)
		{
			if(arr1[i]==arr1[i-1])
			{
				count++;
			}
			else
			{
				count=1;
			}
			
			if(count<=2)
			{
				list1.add(arr1[i]);
			}
		}
		System.out.println(list1+"Two Duplicate items listed");
	}
	
	public static void Remove_two_dupli_Ele_add(int arr1[])
	{
		int count=1;
		List<Integer>list1= new ArrayList();
		//list1.add(arr1[0]);
		for(int i=0;i<arr1.length;i++)
		{
			if(i<arr1.length-1 && arr1[i]==arr1[i+1])
			{
				count++;
			}
			else
			{
				count=1;
			}
			
			if(count<=2)
			{
				list1.add(arr1[i]);
			}
		}
		System.out.println(list1+"Two Duplicate items listed");
	}

}
