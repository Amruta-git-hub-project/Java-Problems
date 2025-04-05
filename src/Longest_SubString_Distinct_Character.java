import java.util.HashSet;
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
		System.out.println("Longest substring of distinct character:- " +Frequencybased_Char(s1,s2));
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
    
	public static int Frequencybased_Char(String x, String s2)
	{
		int maxlenght=0;
		
		Set<Character>set2= new HashSet<>();
		for(int i=0;i<x.length();i++)
		{
			set2.add(x.charAt(i));
		}
		return 0;
		
	}

}
