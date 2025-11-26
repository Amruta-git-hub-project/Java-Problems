
public class Find_Longest_Word_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]arr1= {"i","love","to","automate"};
		
		int maxlenght=0;
		String longestword="";
		
		
		for(int i=0;i<arr1.length;i++)
		{
			//System.out.println(arr1[i]+":print");
			
			if(arr1[i].length()>maxlenght)
			{
				maxlenght=arr1.length;
				longestword=longestword+arr1[i];
				System.out.println("Inner longestword:-"+longestword);
			}
			

			
		}
		System.out.println("longestword:-"+longestword); 

	}

}
