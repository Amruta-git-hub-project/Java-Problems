
public class Duplicate_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String repeat="automation";
	        char[]str=repeat.toCharArray();
	                System.out.println("chararray"+str);
	        for(int i=0;i<str.length;i++)
	        {
	             boolean flag= false;

	            for(int j=0;j<str.length;j++)
	            {
	                if(i!=j && str[i]==str[j])
	                {
	               // System.out.println("chararray i"+str[i]+"chararray j"+str[j]);
	                flag=true;
	                //break;
	                }
	            }
	            if(flag)
	            {
	                System.out.println("final"+str[i]+flag);
	            }
	        }
	    }

	}


