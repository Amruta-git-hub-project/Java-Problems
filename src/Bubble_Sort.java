
public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,67,98,90,102};
		bubble_sort(arr);
		System.out.println("Sorted array:-");
		print_array(arr);
	}
	
	public static void bubble_sort(int arr[])
	{
		int i, j, temp;
		boolean swapped;
		
		for( i=0;i<arr.length;i++)
		{
			swapped=false;
			for(j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]<arr[j])
				{
					//Swapping of no//

					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					swapped=true;
					
				}
				
				if(swapped==false)
				{
					break;
				}
				
				
			}
		}
	}
	
	public static void print_array(int arr[])
	{
		int k;
		for(k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]+"");
		}
	}

}
