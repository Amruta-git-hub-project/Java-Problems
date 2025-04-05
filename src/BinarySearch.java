/*Problems Related to Binary Search
Find the maximum/minimum value in a unimodal function.

Find the optimal point to minimize a mathematical function.

Find the peak element in a unimodal array using Ternary Search.

Find the minimum or maximum element in a bitonic array (increasing then decreasing).

Find the closest element to a given value in a sorted array.
 */


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {8, 11, 8, 10, 2};
	        int target = 10;
	        int result = binarySearch(arr, target);
	        System.out.println(result != -1 ? "Element found at index: " + result : "Element not found");

	}
	public static int binarySearch(int arr[],int target)
	{
int low = 0, high = arr.length-1;
int count=0;
        
        while (low <= high) {
        	count++;
        	System.out.println(count+":-count");

        	System.out.println(low+":-low"+high+":-high");
            int mid = low + (high - low) / 2; // Avoids overflow
            // 2= 0+(4-0)/2--- 1st count
            //mid= 3+(4-3)/2---2nd count
            // mid= 3 + 1/2 i.e 3+0 we get 0 by dividing 1 by 2---2nd count
            //mid=3 ---2nd count
            	
            System.out.println(mid+"midlevel");
            if (arr[mid] == target) return mid;  // Found target in that case only we are returning mid value 
            //arr[3]==10
            else if (arr[mid] > target) high = mid - 1;  // Search left
            
            else low = mid + 1;  // Search right
            //3=2+1 --in 2nd count
        	System.out.println(low+":-lownext"+high+":-highnext"+mid+":midnext");

        }
		
		return -1;// Target not found//
		
	}

}
