
public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Amruta"; 
		int word_lenght= word.length()-1; 
		//System.out.println("word"+word_lenght);
		
		for(int i=0;i<word.length();i++)//
		{ 
			//System.out.println("wordlegth"+i); 
 
		
				int j=word_lenght--;//6
				//System.out.println("reverselenght"+j);  
 
				char k=word.charAt(j);
				System.out.println("reversechar"+k);

			 
		}
		
	}

}
