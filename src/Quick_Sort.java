
public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={34,56,657,7878,90};
		Quick_sort(arr); 
		//System.out.println("Sorted array");
		//print_Array(arr);
		

	}
	
	public static void Quick_sort(int arr[]) 
	{
		int i,j,temp;
		int lowest=0;
		int highest=0;
		
		boolean swapped;
		/*for(i=0;i<arr.length;i++)
		{*/
			
		for(j=1;j<arr.length;j++)
		{
			lowest=arr[0];
			highest=arr.length-1;	
			swapped=false;
			if(lowest<arr[j])
			{
				lowest++;
				//swapping of no//
				
				temp=lowest;
				lowest=arr[j];
				arr[j]=temp;
				
				System.out.println("Sorted array:-"+arr[j]);
				swapped=true;
				
			}
			else
			{
				break;
	
			}
								
			//System.out.println("Sorted array:-"+arr.toString());

		}
		//}
	}
	
	public static void print_Array(int arr[])
	{
		for(int k:arr)
		{
			System.out.println(k+"");
		}
	}

}
