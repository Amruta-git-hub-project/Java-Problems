import java.awt.List;
import java.util.ArrayList;

public class ListProgram {

	public static <string> void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr = { 
                { "A", "A", "A", "A", "A", "A", "A", "D", "D", "D", "D", "D", "D", "D", "D" }, 
                { "1", "1", "1", "1", "1", "1", "1", "0", "0", "0", "A", "0", "0", "0", "0" },
                { "2", "2", "2", "2", "2", "A", "2", "00", "00", "00", "00", "00", "00", "00", "00" }   
            }; 
		
		//List myList = new List();
		String myList= new String();
		//int arrLength = arr.length-1;
		int arrLength =arr.length; 
		for (int i = 0; i <arrLength; i++)   
		{    
	    	System.out.println("row:"+i+ "arrayrow:"+arrLength);
  
			for(int j=0;j<arr[i].length;j++)    
			{   
		    	//System.out.println("row:"+i+ "column:"+j+"rowcol"+arr[i][j]);  
		    	//System.out.println("row:"+i+ "column:"+j);   

				 if (arr[i][j].equals("A"))    
				    {
				    	System.out.println("Asss:"+arr[i][j]+"row"+i+"column"+j);// TO find only "A's" 
				    }  
			} 
			  
		  
		    
		      //  myList.add(arr[0, i]);
		   // else
		      //  continue;
		    }
		}
	}


