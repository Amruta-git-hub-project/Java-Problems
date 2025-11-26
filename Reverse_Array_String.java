
public class Reverse_Array_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       String words[]={"Dog","Cat","Mouse"};
	     
	        //String rev="";
	        
	        for(int i=0;i<words.length;i++)
	        {
	        	String rev="";
	        //System.out.println("each word"+words[i]);
	        String ch=words[i];
	        
	    char[]arr1=ch.toCharArray();
	            //System.out.println(arr1[2]+"arraycharacter");

	        for(int j=arr1.length-1;j>=0;j--)
	        {

	            rev=rev+arr1[j];
	        //System.out.println("rev word"+arr1[j]);
	        }
	        //System.out.println("length word"+words[i].length());
	        System.out.println("each word"+rev);


	        }
	}

}
