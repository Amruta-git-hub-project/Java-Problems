import java.util.ArrayList;
import java.util.List;

public class Merge_n_sort_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]={1,4,5,2};
		int arr2[]={2,2,7,8};
		int arr3[]={3,4,5};
		
		int a=0;
		int b=0;
		int temp=0;
		
		List<Integer> set1 =new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			set1.add(arr1[i]);
			
		}
		for(int j=0;j<arr2.length;j++)
		{
			set1.add(arr2[j]);
		}
		for(int k=0;k<arr3.length;k++)
		{
			set1.add(arr3[k]);
		}
		
		int n=set1.size();
		for(int i=0;i<n;i++)
		{
			System.out.println(i+"count");

			//swapped=false;
          //  for (int j = 0; j < n - 1; j++) 
            	   for (int j = 0; j < n - i - 1; j++)
			{
				a=set1.get(j);

				b=set1.get(j+1);
				
				if(a>b)
				{
					//Swapping of no//

					temp=a;// asigned j value to temp
					
					set1.set(j, set1.get(j + 1));//replace the value of j with j+1//
					set1.set(j + 1, temp);//replaces the value of j+1 with original value that was original at j index
					
				}

			}

		}
System.out.println(set1+"sorted list");
}

}
