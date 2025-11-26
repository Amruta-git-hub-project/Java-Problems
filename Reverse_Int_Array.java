
public class Reverse_Int_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.println("Try programiz.pro");
	        int []intarray={345,987,56785}; 
	        String []strarray= new String[intarray.length];
	        //System.out.println("String array"+ strarray.length);
	       
	     for(int i=0;i<intarray.length;i++)
	     {
	        strarray[i]=String.valueOf(intarray[i]);//to convert int to String we use String.valueof
	        //System.out.println("String value"+ strarray[i]);
	        String rev=""; 
	        
	        String newint=strarray[i];
	        //.out.println("String new"+ newint);
	        char[]arr1= newint.toCharArray();
	        //System.out.println("String new arr"+ arr1[1]);
 
	        for(int j=arr1.length-1; j>=0;j--)
	        {
	            rev=rev+arr1[j];
	        }
	    System.out.println("Reversed array"+ rev);

	        
	     }
	}

}
