import java.util.Arrays;

public class Reverse_Array_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		String words[]={"Dog","Cat","Mattress"};
		int wordlength= words.length;
		//System.out.println(wordlength +"arraylength");  
		 
		for(int i=0;i<words.length;i++) 
		{ 
			//String c =words[i]; 
	        //c = new StringBuilder(c).reverse().toString(); // use StringBuilder to reverse the word
	       // System.out.println(c +"Reverse");  
	       // words[i]=c;
			// Myway to reverse the each string//
			String c =words[i];//dog 
			
			int charsize=c.length()-1; //2
			for(int j=charsize;j>=0;j--) 
			{
				rev= rev+c.charAt(j);//
				
			}  
			System.out.print(rev+" ");  
			rev="";  
			//wordlength--;
			//String reverse= words[wordlength];  
			//System.out.println(reverse +"reversewords");// THis is for reversewords//  
			
		}
	   // System.out.println(Arrays.asList(words));   

	}

}

/*
 * for(int j=0;j<c.length();j++) 
			{
				//System.out.println(c +"words" +charsize +"sizeofchar"); 
				 

				int reversesize=charsize--;
				char reversechar=c.charAt(reversesize); 
				// rev=reversechar; 
				 System.out.println(reversechar+"Reverstring"); 
				 

   
			} 
			wordlength--;
			String reverse= words[wordlength];  
			//System.out.println(reverse +"reversewords");// THis is for reversewords//  
			*/
