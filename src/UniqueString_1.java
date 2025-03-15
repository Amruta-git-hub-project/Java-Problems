import java.util.Scanner;

public class UniqueString_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner (System.in); 

		String word="";
		 System.out.println("Enter a word: ");
	     word = kb.nextLine();
	     UniqueCharacter(word);
	     
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

}
