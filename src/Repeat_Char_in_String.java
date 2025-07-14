
public class Repeat_Char_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sr="AMruta";
		
		char []ch= new char[sr.length()];
		
		for(int i=0;i<sr.length();i++)
		{
			ch[i]=sr.charAt(i);
		}
		int count =0;

		for(int k=0;k<ch.length;k++)
		{
			System.out.println(ch[k]);
			if(ch[k]=='A' || ch[k]=='a')
			{
				count++;
				System.out.println(ch[k]+" count "+count);

			}
		}
	}

}
