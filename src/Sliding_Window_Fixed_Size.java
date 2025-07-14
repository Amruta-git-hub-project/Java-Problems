

/*
 * Find max sum of subarray  of Size K (Fixed size)
 * For eg:- i/p[2, 1, 5, 1, 3, 2] and k size is 3
 * starting with 2+1+5=8 then maxsum(8)
 * then we remove arr[0]=2 slide window from arr[1]and add arr[3]=1 which becomes windowsum(8-2)+1=7
 * maximum is from maxsum(8,7) is 8
 * then we remove arr[1]=1 and add arr[4]=3 which becomes (7-1)+3=9
 *  * maximum is from maxsum(8,9) is 9
 *  then we remove arr[2]=5 slide window from arr[3]and add arr[5]=2 which becomes windowsum(9-5)+2=6
 *  maximum is from maxsum(9,6) is 9


 */
 
public class Sliding_Window_Fixed_Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int arr[] = {2, 4, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Max Sum: " + maxSum(arr, k));  	
        
		
	}

	public static int maxSum(int arr[], int k)
	{
		int maxsum=0;
		int windowsum=0;
		
		  // Compute the sum of the first window
		for(int i=0;i<k;i++)
		{
			windowsum+=arr[i];
		}
		maxsum=windowsum;
		
		 // Slide the window
		
		for(int i=k;i<arr.length;i++)
		{
			windowsum += arr[i] - arr[i - k];  // Add new element, remove old element
			//arr[] = {2, 4, 5, 1, 3, 2}
			//10+1-2=9
			System.out.println(arr[i - k]+"removing first item");

			System.out.println(arr[i] - arr[i - k]+" adding next item"+windowsum+"windowsum");
			System.out.println(maxsum+"maxsum");
			
			if(windowsum>maxsum)
			{
				maxsum=windowsum;
			}

		}
		
		
		return maxsum;
		
	}
}
