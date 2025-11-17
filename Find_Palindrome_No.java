
public class Find_Palindrome_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12321;   // Example number
        int original = number; // Keep a copy of original
        int reversed = 0;
        int count=0;
        // Logic to reverse the number
        while (number > 0) {
        	count++;
            int digit = number % 10;         // Get last digit
            System.out.println(digit+"digit"+count);
            reversed = reversed * 10 + digit; // Build reversed number
            System.out.println(reversed+"reversed"+count);

            number = number / 10;             // Remove last digit
            System.out.println(number+"number"+count); 

        }
        
        // Compare original with reversed
        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
	}

}
