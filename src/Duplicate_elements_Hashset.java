import java.util.HashSet;

public class Duplicate_elements_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]={12,34,56,7};
		int arr2[]={7,8,9,12};
		int arr3[]={56,34,12};
		
		
		HashSet<Integer>hash= new HashSet<>();
		
		for(int i=0; i<arr1.length;i++)
		{
		hash.add(arr1[i]);
		//System.out.println(hash+"arr1");
		
		}
		for(int j=0;j<arr2.length;j++)
		{
			hash.add(arr2[j]);
		}
		
		for(int k=0;k<arr3.length;k++)
		{
			hash.add(arr3[k]);
		}
		
		for(int no:hash)
		{
		
				System.out.println(no);

			
		}
	}
 
}
