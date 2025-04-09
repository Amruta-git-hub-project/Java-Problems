import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Longest_SubString_Distinct_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "abceabcbb";
		String s1="forxxorfxdofr";
		String s2="for";
		
		/* I/p:- String s1="forxxorfxdofr";

		 * o/p:- "for", "orf", "ofr" it should be 3
		 */
		
		
		//System.out.println("Longest substring of distinct character:- " +Distinct_Char(sentence));
		Frequencybased_Char(s1,s2);
		//System.out.println("Longest substring of distinct character:- " +Frequencybased_Char(s1,s2));
	}
	
	public static int Distinct_Char(String s)
	{
		int maxlength=0; int start=0;
		
		Set<Character> set1= new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			while(set1.contains(s.charAt(i)))
			{
				set1.remove(s.charAt(start));

			}
			start++;
			set1.add(s.charAt(i));
			 
		}
		//System.out.println(set1.size()+"set1");
		maxlength=set1.size();
		return maxlength;

}
    
	public static void Frequencybased_Char(String x, String s2)
	{
		/*char maxlength;
		char req;
		int reqsize=0;
		
		for(int i=0;i<x.length();i++)
		{
			//System.out.println("s2"+s2);
			  maxlength = x.charAt(i);
			  req=s2.charAt(i);
			  
			  while(reqsize<s2.length())
			  {
				  if(maxlength==req)
				  {
					  System.out.println("eqaul");
					  System.out.println("maxleng"+ maxlength);		  
				  }
				  reqsize++;

			  }
			break;
			//set2.add(x.charAt(i));
			
			
			
		}*/
		
		/////////////////////////Chatgpt/////////////////////////////////////////
		int patternLen = s2.length();

        // Convert pattern to a List
        List<Character> patternList = new ArrayList<>();
        for (char ch : s2.toCharArray()) {
            patternList.add(ch);
        }

        for (int i = 0; i <= x.length() - patternLen; i++) {
            String sub = x.substring(i, i + patternLen);
            List<Character> tempList = new ArrayList<>(patternList); // make a copy

            boolean isAnagram = true;
            for (char ch : sub.toCharArray()) {
                if (tempList.contains(ch)) {
                    tempList.remove((Character) ch); // remove one occurrence
                } else {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram && tempList.isEmpty()) {
                System.out.println("Found: " + sub);
            }
            
            //
		}
		
		
		
		
		
	}

}
