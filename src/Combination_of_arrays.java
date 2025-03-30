import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Combination_of_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Input: n = 4, k = 2
		Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]*/
		
		int arr1[]={1,2,3,4};

		
		Combination(arr1);
		//ListMerge(arr1);

	}
	
	public static void Combination(int arr1[])
	{
		//HashMap<Integer,HashMap<Integer, Integer>>set= new HashMap<Integer,HashMap<Integer, Integer>>();
		HashMap<Integer, Integer>set= new HashMap<Integer, Integer>();
		
			for(int j=0;j<arr1.length;j++)//key//
			{
				for(int k=j+1;k<arr1.length;k++)// value //
				{
					set.put(arr1[j], arr1[k]);
					System.out.println("Added :"+arr1[j]+" : "+arr1[k]+set);
					/*List al = Arrays.asList(set);
					 
			        System.out.println(al);*/
				}
				
			}

			//System.out.println(set+"combination");
		
	}

	
	public static void ListMerge(int arr1[])
	{
		
		List<Integer>set= new ArrayList<Integer>();
		List<Integer>set1=new ArrayList<Integer>();
		List<Integer>set2=new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++)
		{

			
			for(int j=i+1;j<arr1.length;j++)
			{
				set.add(arr1[i]);
				set1.add(arr1[j]);
				
			}


		}
		set2.addAll(set);
		set2.addAll(set1);

		System.out.println(set+ "1st set");
		System.out.println(set1+" 2nd set");
		System.out.println(set2+" final set");

	}

}

