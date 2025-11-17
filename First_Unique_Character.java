
//*** This is the case when we want to find only first unique characters in a String ***///

public class First_Unique_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="automation";
		
		char[] arr=word.toCharArray();
		
		
		
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			boolean duplicate=false;// Its declare out so that if duplicate is found 'true' it will not get continue i.e for each char it will start fresh 
			for(int j=i+1;j<arr.length;j++)// In this case it will not compare first outer loop i.e it will not compare char backwards and will go on with next letter
			{
// it will compare u with t then t with o but it will not go backwards i.e u will not compare with a backwards and so on.//				
				if(arr[i]==arr[j])
				{
					duplicate=true;
					break;
				}

			}
			
			if(!duplicate)
			{
				System.out.println(arr[i]+"Unique char"+count+"count"+duplicate);
				break;
			}
			else
			{
				count++;
				System.out.println(arr[i]+"duplicate char"+count+"count"+duplicate);

			}
		}
		
		
	}

}
