
public class Binary_NO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//finding 0 between two 1's in binary no 1010001001101	
		
		//int[] binary={1,0,0,1,0,1,0,1,0,0,1}; 
		String binary="1010101001111";// previous string and array method
		int count=0;
		int consecutive=0;
		
		for(int i=0;i<binary.length();i++)
		{
			
			try{
				if(String.valueOf(binary.charAt(i)).equals("1"))
				{
					if(String.valueOf(binary.charAt(i+1)).equals("0"))
					{
						if(String.valueOf(binary.charAt(i+2)).equals("1"))
						{
							count++;
						}
					}
				}
			}
			catch(Exception e)
			{
				break;
			}
		}
		
	 System.out.println(count);
	}

}
