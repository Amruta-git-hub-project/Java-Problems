import java.util.Arrays;

public class Sorting_colors {

/*	//Sorting colors 
	2=red, 1 white, 0 blacck
	Input: nums = [2,0,2,1,1,0]
	Output: [0,0,1,1,2,2]
	
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]={2,0,2,1,1,0};
		Sorting_color(arr1);

	}
	
	public static void Sorting_color(int arr1[])
	{
		int temp=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}

		}
		System.out.println(Arrays.toString(arr1)+"sorted");

	}

}
