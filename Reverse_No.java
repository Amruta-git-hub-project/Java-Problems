
public class Reverse_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println("Try programiz.pro");
	        int num=465468;
	        String str="";
	        str=str+num;
	       //System.out.println("String"+str);
	       char[]arr1=str.toCharArray();
	       System.out.println("no"+arr1[2]);
	        for(int i=arr1.length-1;i>=0;i--)
	        {
	              System.out.println(arr1.length+i+"Reverse NO"+arr1[i]);

	        }

	}

}
