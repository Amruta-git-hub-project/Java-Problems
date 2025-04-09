import java.util.ArrayList;
import java.util.List;

public class Reverse_K_Nodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
		int arr1[]={1,2,3,4,5};
		
		//Reverse_FirstNodes(arr1,k);
		Reverse_Nodes(arr1,k);
	}
	
	//*********THis will work only in case of first k elements only*************//
	public static void Reverse_FirstNodes(int arr[],int k)
	{
		List<Integer>list1= new ArrayList<>();
		int temp1=0;
		int temp=arr[0];
		int largerst=0;
		
		//Reverse first k elements
		for(int j=k-1;j>=0;j--)
		{
			list1.add(arr[j]);
			
		}
		
		//Adding remaing elements in arraylist
		for(int i=k;i<arr.length;i++)
		{
			list1.add(arr[i]);  
		}
		System.out.println(list1);

	}

	//*********THis will work only in case of first k elements only*************//

	public static void Reverse_Nodes(int arr1[],int k)
	{
		List<Integer>list1= new ArrayList<>();
		//TO find the last element of array while grouping k=2 elements everytime //
		for(int i=0;i<arr1.length;i+=k)
		{
			int end=0;
			if(i+k<arr1.length)
			{
				end=i+k;
			}
			else
			{
				end =arr1.length;
			}
			/*1st iteraton
			 * i=0;i+k=0+2=2; end=2
			 * 2nd iteration
			 * i=2;i+k=2+2=4; end=4
			 * 3rd iterantion
			 * i=4;i+k=4+2=6; end= arr.length=5
			 * 
			*/
			
			for(int j=end-1;j>=i;j--)
			{
				/*1st iteration j=5-1;j=4 
				 * last iteration when j=2-1;j should be 1 and i =0
				 */
				list1.add(arr1[j]);
			}
			System.out.println(list1+"reverse node");

		}
		//System.out.println(list1+"reverse node");

	}
	
}
