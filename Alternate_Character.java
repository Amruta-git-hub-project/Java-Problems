
public class Alternate_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     String name="amruta naik";
		     
		     String str=name.replace(" ","");
		     String altname="";
		     
		     char[]arr1=str.toCharArray();
		     
		     for(int i=0;i<arr1.length;i=(i+2))
		     {
		    	 altname=altname+arr1[i];
		    	 
		     }

		     System.out.println(altname+" :-alternate name");
	}

}
