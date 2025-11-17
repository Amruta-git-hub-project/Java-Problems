
public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     String sent="I love, coding";
	     sent=sent.replace(",","");
	            char[] arr= sent.toCharArray();
	            System.out.println(arr.length+"ell");
	            String rev="";
	            
	            for(int i=arr.length-1; i>=0; i--)
	            {
	                //char letter= arr.charAt[i];
	                char letter= arr[i];
	                System.out.println(letter+"letere");
	                rev=rev+letter;
	                
	            }
	                        System.out.println(rev+"reversed");

	}

}
