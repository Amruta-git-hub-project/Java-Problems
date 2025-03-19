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

		for(int i=0;i<arr1.length;i++)
		{
			a=arr1[4];
			list1.add(arr1[i]);
			//System.out.println("Array value till largest no"+ arr1);

		}
		System.out.println("Array value till largest no"+ arr1);
		
		for(int j=0;j<=a;j++)
		{
			//arr2=new int[j];
			list1.add(j);
			//System.out.println("Array value till largest no"+ list1);

		}
		System.out.println("Array value of all largest no"+ list1);


				
		}

	}


