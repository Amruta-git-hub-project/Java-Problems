import java.util.HashMap;

/*
 * Getting the count of lenght of value whose output of sum K=5
 */
public class Longest_Subarray_Brutes_Force {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] = {1, 2, 3, 1, 1, 1, 1, 2};
	        int K = 5;
	        System.out.println("Longest Subarray Length: " + longestSubarray(arr, K)); // Output: 4
	       // System.out.println("Not working Longest Subarray Length: " +LongestSubarraySliding_Window_HashMap(arr, K));
	}
	
	public static int longestSubarray(int arr[], int k)
	{
		int maxLen=0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"col--"+arr[i]+"element");
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
    			System.out.println(j+"row--"+arr[j]+"element");

                sum += arr[j];
    			System.out.println(sum+"sum");

                if (sum == k) {
        			System.out.println(sum+"equal");

                    // Instead of Math.max(), we manually update maxLen
                    if ((j - i + 1) > maxLen) {
                        maxLen = j - i + 1;
                    }
                }
            }
        }

        return maxLen;
		
	}

	public static int LongestSubarraySliding_Window_HashMap(int arr[], int k)
	{
		 HashMap<Integer, Integer> map = new HashMap<>();
	        int sum = 0, maxLen = 0;	

	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i]; // Expand window

	            if (sum == k) {
	                maxLen = i + 1;
	                System.out.println("maxLen---"+maxLen);
	            }
	            
	            if (!map.containsKey(sum)) {
	                map.put(sum, i);
	                System.out.println("Mapcontains:-"+map);

	            }
	            
	            if (map.containsKey(sum - k)) {
	                System.out.println("Mapcontains sum-k:-"+map);

	                int currentLength = i - map.get(sum - k);
	                System.out.println("index:-"+i);

	                System.out.println("currentLength:-"+currentLength);

	                if (currentLength > maxLen) {
	                    System.out.println("maxLenfinal"+maxLen);// Instead of Math.max()
	                    maxLen = currentLength;
	                }
	            }
	        }

	        return maxLen;
	    }
		
	}

