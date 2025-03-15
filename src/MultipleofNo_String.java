import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MultipleofNo_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,4,5,9,10,15,20,21,22,30};
		ReplaceStringNo(arr);
		

	}

	public static void ReplaceStringNo(int arr[]) 
	{
		List<String> set= new ArrayList<String>();
		//HashSet<String> set= new HashSet<String>(); 

		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%3==0 && arr[j]%5!=0)
			{
				
			//System.out.println(arr[j]+"Buzz");
			set.add("Buzz");		
			}
			
			else if(arr[j]%5==0 && arr[j]%3!=0) 
			{
				//System.out.println(arr[j]+"Fizz");

				set.add("Fizz");

			}  
			
			else if (arr[j]%3==0 && arr[j]%5==0) 
			{
				//System.out.println(arr[j]+"BuzzFizz");
				set.add("BuzzFizz");

			}
			else
			{
				set.add(String.valueOf(arr[j]));
			}
			
		}
		
		//System.out.println(Arrays.toString(arr)+"Final");
		System.out.println(set);

	}
}
