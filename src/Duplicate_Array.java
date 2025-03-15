import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

////////////////////////////////////Not Working//////////////////////////////////////////////////////////////////
public class Duplicate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]={12,34,56,7};
		int arr2[]={7,8,9,12,7}; 
		int arr3[]={56,34,12}; 
		
		HashSet<Integer>hash1= new HashSet<>();
		
	    List<Integer> list = new ArrayList();

		
		for(int i=0;i<arr1.length;i++)
		{
		hash1.add(arr1[i]);
		list.add(arr1[i]);
		} 
		
		for(int j=0;j<arr2.length;j++)
		{
		hash1.add(arr2[j]);	

		list.add(arr2[j]); 

		}
		
		//Removing Duplicates;
	    Set<Integer> s= new HashSet<Integer>();
	    s.addAll(list);  
	    System.out.println(s+"set"); 
	    list = new ArrayList<Integer>();
	    list.addAll(s); 
	    System.out.println(list+"list"); 

	    //Now the List has only the identical Elements
		
		
	}

}
