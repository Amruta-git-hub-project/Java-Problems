import java.util.HashSet;

public class Missing_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,5,5,6,8,8,25}; 
		Missing_No_Call(arr);
		//System.out.println("Missing No are:-");
		

	}
	
	public static void Missing_No_Call(int arr[])
	{
		//Find the largest No//
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				largest=arr[i];
				
			}
			
		}
		
		HashSet<Integer> set= new HashSet<Integer>();
		HashSet<Integer> set1=new HashSet<Integer>();
		
		int arr1[]=new int[largest+1];
		
		for(int k=0;k<arr1.length;k++)
		{
			set.add(k);
		}
		for(int l=0;l<arr.length-1;l++)
		{
			if(arr[l]==arr[l+1])
			{
				set1.add(arr[l]);
				System.out.println(set1+"reduntant no");
			} 	
			
		}
		
		for(int m=0;m<arr.length;m++)
		{
			set.remove(arr[m]);
		}
		
		for(int x:set)
		
		{
			System.out.println("Missing No are:"+x);

		}
			
		
		
		
	}

}
