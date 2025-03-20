import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Position_target_value_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={5,7,8,8,10};
		int a=0;
		int arr2[]=new int[0];
		List<Integer>list1= new ArrayList<Integer>();
		List<Integer>list2= new ArrayList<Integer>();

		int largest=arr1[0];
		
		for(int i=0;i<arr1.length;i++)
		{
			if(largest<arr1[i])
			{
				largest=arr1[i];
			}
			a=largest;
			list1.add(arr1[i]);
			//System.out.println("Array value till largest no"+ arr1);

		}
		System.out.println("Array value till largest no"+ Arrays.asList(arr1));
		
		for(int j=0;j<=a;j++)
		{
			//arr2=new int[j];
			list1.add(j);
			//System.out.println("Array value till largest no"+ list1);

		}
		System.out.println("Array value of all largest no"+ list1+"arrayslist"+arr1);
		
		for(int j=0;j<list1.size();j++)
		{
			System.out.println("size of list"+list1.size()+"arraylist of arr1"+arr1);
			if(Arrays.asList(arr1).contains(list1.get(j)))
			{
				System.out.println("array size"+arr1+"list element"+list1.get(j));

				list1.remove(j);
				j--;
			}
		}
		
		
		/*while (!list1.isEmpty())
		{*/
			//System.out.println("checking");
			//list2.addAll(list1);
			//list2.remove(Arrays.asList(arr1));
		//}
			
		System.out.println("Missing no"+ list1);

				
		}

	}


