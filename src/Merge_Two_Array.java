import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Merge_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,2,3,0,0};
		int arr2[]={2,5,6};
		//int size1=0;
		//int size2=0;
		
		//output:- {1,2,2,3,5,6} 
		
		
		Merge_Sorted_Array(arr1,arr2);
		//sonyamerge(arr1,arr2);
		

	}
	
	public static void sonyamerge(int arr1[],int arr2[])
	{
		List<int[]> tempArr1=Arrays.asList(arr1);
		List<int[]> tempArr2=Arrays.asList(arr2);
		
		System.out.println(tempArr1);
		System.out.println(tempArr2);
		
		//System.out.println();
		
	}
	
	public static void Merge_Sorted_Array(int arr1[],int arr2[])
	{
		List<Integer> set=new ArrayList<Integer>();
		//HashSet<Integer>set=new HashSet<Integer>();
		int temp=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==0)
			{
				break;
			}
			else
			{
				set.add(arr1[i]);

			}
		}
		for(int j=0;j<arr2.length;j++)
		{
			if(arr2[j]==0)
			{
				break;
			}
			else
			{
				set.add(arr2[j]); 

			}
		}
		
		//System.out.println(set+"merged array");
		sortArray(set);
	}

	private static void sortArray(List<Integer> setArray) {
		// TODO Auto-generated method stub
		
		//System.out.println(setArray);
		
		int temp1=0;
		int temp2=0;
		int temp=0;
		for(int i=0;i<setArray.size();i++)
		{
			for(int j=i+1;j<setArray.size();j++)
			{
				temp1=setArray.get(i);//3
				temp2=setArray.get(j); 
				//if(setArray.get(i)>setArray.get(j))
				if(temp1>temp2)
				{
					//temp1=setArray.get(i);//3
					//temp2=setArray.get(j);
					
					//setArray.get(i)=temp2;
					
					temp=temp1;
					temp1=temp2;
					temp2=temp;
					

				}
				

			}
				
			//System.out.println(temp1+"merged array");	

		}
		
		
		System.out.println(setArray+"merged array");	
	}
	


}

/*if(arr1[i]<arr2[j])
{
	/*temp=arr1[i];
	arr2[j]=temp;
	
	temp=arr1[i];
	arr1[i]=arr2[j];
	arr2[j]=temp;
	System.out.println(arr2[j]+"last");

}*/
