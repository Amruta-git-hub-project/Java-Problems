import java.util.Arrays;

public class Find_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To find the string is palindrome or not//
		String str="A man, a plan, a canal: Panama";
		
		  String cleaned= str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		 // String cleaned= "12321"; 
		  char[]arr=cleaned.toCharArray(); boolean palindrome=true;
		  //System.out.println(cleaned+":"+Arrays.toString(arr));
		 
		

		int left = 0, right = arr.length - 1;

        while (left < right) {
        	// We are using while loop since in palindrome case we are comparing value from left and right that is two opposite strings//
        	
          //  System.out.println(left+"&"+right);

            if (arr[left] != arr[right]) {

                palindrome = false;
                break;
            }
            left++;
            right--;
            System.out.println(arr[left]+"&"+ arr[right]);

        }
		 
		 
		 // since the for loop checks all inner loop i.e (j) with outer loop(i) it gets failed.//
		 
		
		/*
		 * for(int i=0;i<arr.length;i++) { for(int j=arr.length-1;j>0;j--) {
		 * if(arr[i]!=arr[j]) { palindrome = false; System.out.println(arr[i]+"&"+
		 * arr[j]);
		 * 
		 * break; } } }
		 */
		
		System.out.println(palindrome);

		if(palindrome)
		{
			System.out.println("Its palindrome");
		}
		else
		{
			System.out.println("Its not palindrome");
		}

	}

}
