import java.util.Arrays;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String no="1001010001101";
		String overlapno="10101";
		
		Overlapping(overlapno);
		
		char[] ch= no.toCharArray();
		int count=0;

		for(int i=0; i<ch.length-2;i++)
		{
			if(ch[i]=='1' && ch[i+1]=='0' && ch[i+2]=='1')
			{
				System.out.println(ch[i+2]+": index" +i +"pos");
				

				count++;
			}
			System.out.println(Arrays.toString(ch)+"palindrome"); 
		}
		System.out.println(count+":count");
		
		
		

	}

	private static void Overlapping(String no) {
		// TODO Auto-generated method stub
		
	}

}
