import java.util.Arrays;

public class Stack_Reverse_Array_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] wordList = {"Stressed", "Parts", "Straw", "Keep", "Wolf"};
		    for (int i = 0; i < wordList.length; i++) 
		    { 
		        String word = wordList[i]; // Get the word from array
		        word = new StringBuilder(word).reverse().toString(); // use StringBuilder to reverse the word
			   System.out.println(word+"ReverseString");  
 
		        wordList[i] = word; // put word back in the array
			    //System.out.println(wordList[i]+"for loop"); 

		    }          
		    System.out.println(Arrays.asList(wordList));  

	}

} 
