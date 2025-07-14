
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input="happy happy independence day";
	        String str[]=input.split(" ");
	        char rev;
	        int count=0;
	        for(int i=0;i<str.length;i++)
	        {
	        	count++;
               // System.out.println(count+"count");

	            for(int j=str[1].length()-1;j>=0;j--)
	            {
	                rev=str[1].charAt(j);
	                System.out.println(rev+"string");
	                
	            }
	        }
	        System.out.println(count+"count");
	}

}
