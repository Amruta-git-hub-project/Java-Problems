import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Swap_Nodes_inPairs {
	
	/*Swap adjacent nodes and convert it into head converting into different array
	 * 
	 * i/p arr1[]={1,2,5,6,7,8}
	 * 
	 * 1->2,5->6,7->8
	 * it will become
	 * 2->1, 6->5, 8->7
	 * o/p arr1[]={2,1,6,5,8,7}
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,2,5,6,7,8};
		
		//Swap_Nodes_Heads(arr1);
		//Swap_HashMap(arr1);
		Swap_nodes(arr1);

	}
	
	public static void Swap_Nodes_Heads(int arr1[])
	{
		List<Integer>set= new ArrayList<Integer>();
		int temp=0;
		int row=0;
		int col=0;
		
		/*for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
			
				
				temp=arr1[j];
				arr1[j]=arr1[i];
				arr1[i]=temp;
				if(arr1[i]<arr1[j])
				{
					if(arr1[j]!=0)
					{
						temp=arr1[j];
						arr1[j]=arr1[i];
						arr1[i]=temp;
					}
					else
					{
						break;
					}
				}

			}
			
			

		}*/
		
		  // Swap adjacent elements
        for (int i = 0; i < arr1.length - 1; i += 2) {
            temp = arr1[i];
            //temp=1,5,7//
            arr1[i] = arr1[i + 1];
            //arr[i]=2,6,8//
            arr1[i + 1] = temp;
            //arr[i+1]=1,5,7//
        }
        // Print the modified array

		System.out.println(Arrays.toString(arr1)+"column");
		//o/p:- 2,1,6,5,8,7//
		
	}

	public static void Swap_HashMap(int arr1[])
	{
		HashMap<Integer,Integer>set1=new HashMap<Integer,Integer>();
		int temp=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				temp=arr1[j];
				arr1[j]=arr1[i];
				arr1[i]=temp;
				if(arr1[i]!=arr1[j])
				{
					set1.put(arr1[i], arr1[j]);

				}
				//System.out.println(set1 +"swapped nodes");

			}

		}
		System.out.println(set1 +"swapped nodes");
	}
	
	public static void Swap_nodes(int arr1[])
	{
		List<Integer>set= new ArrayList<Integer>();
		int temp=0;
		int row=0;
		int col=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				temp=arr1[j];
				arr1[j]=arr1[i];
				arr1[i]=temp;
				break;

			}
			i++;
			set.add(arr1[i]);
		}
		System.out.println(set +"swapped nodes");

		
	}
	
	

}
