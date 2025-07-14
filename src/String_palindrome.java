
public class String_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "babad";
        int maxLength = 0;
        int startIndex = 0;

  
        
        	//COnvert string to String array //
       /* String arr[]=input.split("");
        System.out.println(arr.length);
       but here we are gettin error while executing whole code*/
        
        
        // Step 1: Convert string to character array
       char[] arr = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i);
        }

        // Step 2: Check all possible substrings for palindrome
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                boolean isPalindrome = true;

                // Manually check if characters from i to j form a palindrome
                int start = i;
                int end = j;
                while (start < end) {
                    if (arr[start] != arr[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                // If it's a palindrome and longer than previous, update
                if (isPalindrome && (j - i + 1 > maxLength)) {
                    maxLength = j - i + 1;
                    startIndex = i;
                }
            }
        }

        // Step 3: Print the longest palindrome found
        System.out.print("Longest Palindromic Substring is: ");
        for (int i = startIndex; i < startIndex + maxLength; i++) {
            System.out.print(arr[i]);
        }
	}

}
