import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UniqueString_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner (System.in); 

		String word="";
		 System.out.println("Enter a word: ");
	     word = kb.nextLine();
	     
	     //Three different methods//
	     
	     //UniqueCharacter(word);
	     ArrayCharacter(word);
	     //Predefined_function(word);
	     
	}
	
	public static void UniqueCharacter(String text)
	{
		String temp="";
		for(int i=0; i<text.length();i++)
		{
			
			if(temp.indexOf(text.charAt(i))==-1)
				
			{
				System.out.println(temp.indexOf(text.charAt(i))+"character");
				temp=temp+text.charAt(i); 
			} 
			
			/* Comment the else block if wanted the character to repeat only once for eg:- aabbcd then o/p will be abcd    */
			else  
			{
				temp=temp.replace(String.valueOf(text.charAt(i)), " ");  
			} 
		}
		System.out.println(temp +"");  
	}
	
	public static  void ArrayCharacter(String text)
	{
	    //String text = "aabbccddey";
        char[] arr = text.toCharArray();//Conver the string to chararray[]
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            char current = arr[i];
            int count = 0;// initialise inside the outer loop so that it gets refreshed when outer loop is called
            System.out.println("->outer loop: " + current);
            // Count how many times this character appears
            for (int j = 0; j < arr.length; j++) {// j=0 because it will call itself 
                if (arr[j] == arr[i]) {
                    count++;
                   
                }
                System.out.println("inner loop: " + arr[j]);
                System.out.println("count: " +count);
               
            }
            System.out.println("finalcount: " +count);
            System.out.println("current->: " +current);
            // If character appears only once, add to result
            if (count == 1) {// outer loop whose count is "1" will b unique one
                result += arr[i];// Here we always add the outer loop index 
            }
        }

        System.out.println("Output: " + result);
		  
		
	}
	
	public static void Predefined_function(String text)
	{
		   String result = "";
		   for(int i=0;i<text.length();i++)
		   {
			   char ch=text.charAt(i);
			   if(text.indexOf(ch)==text.lastIndexOf(ch))//indexOf(ch)-> first index , lastIndexOf(ch)->last index
			   {
				   result+=ch;
			   }
			   
		   }
		   System.out.println("Output: " + result);
	}

}
