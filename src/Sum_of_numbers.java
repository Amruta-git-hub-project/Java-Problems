import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int expected=36; 
		Sumofno(arr,expected);

	}
	
	//Op should be sum of array in arraylist should be 15 i.e from 1 to 5 position 
	public static void Sumofno(int arr[],int expected)
	{ 
		int temp=0;
		 int temp1=0;

		List<Integer>set=new ArrayList<Integer>(); 
		
		for(int i=0; i<arr.length;i++)
		{
			temp=temp+arr[i]; 
		
			set.add(arr[i]);
			if(temp==expected)
			{ 
				break;
			}
			

		
		}
		System.out.println(set+"= "+temp);
		
		
	}

}
