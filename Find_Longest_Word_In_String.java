
public class Find_Longest_Word_In_String {

	//*** Here if we want to find the smallest word then we have to put maxlength as "1" and change the if condition as "if(currentword.length()<=maxlength)"**//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i love red color clothes";
		char[]arr1=str.toCharArray();
		int maxlength=0;
		String currentword="";
		String  longestword=""; 
		 
		for(int i=0;i<arr1.length;i++)
		{
			
			 if(arr1[i]!=' ')
			 { 
				 currentword=currentword+arr1[i];// this concatinate thes pace // }
			 }
			 
			 
			else
			{
				System.out.println("currentword:-"+currentword+ "currentword.length:-"+currentword.length());  //currentword=1(i),5(love),4(red),6(color)

				if(currentword.length()>maxlength)// Here we only put maximum length character inside this loop
				{
					maxlength=currentword.length();//maxlength=1(i),5(love),6(color)
					System.out.println(maxlength+"maxlength"); 

					longestword=currentword;
					 System.out.println("Inner loop Longest word = " + longestword);

				}
				currentword=" ";//reset for next word//Here we skip red since its count is lesser 
			}
		}
		 
		//*** This if condition  we are printing for the last character***//
		if(currentword.length()>maxlength) 
		{
		 maxlength=currentword.length();
		 longestword=currentword; 
		 }
		 
		
		 System.out.println("Longest word = " + longestword);
		 System.out.println("Length = " + maxlength);  

	}

}
