
//*** This is the case when we want to find all unique characters in a String ***///
public class AllUnique_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String word="automation";
		
		char[] arr=word.toCharArray();
		
		
		
		int unq_count=0;// Its declare out so that it will get incremented only in case of unique char found 
		int dupli_count=0;// Its declare out so that it will get incremented only in case of duplicate char found 
		
		for(int i=0;i<arr.length;i++)
		{
			boolean duplicate=false;
			for(int j=0;j<arr.length;j++)// In this case it will compare with the each character that with backwards char also
			{
				//if( arr[i]==arr[j])
				if( i!=j && arr[i]==arr[j])// In this case (i!=j) because we dont want to compare char with itself
				{
					duplicate=true;
					break;
				}
				//System.out.println(arr[i]+" :-i element "+arr[j]+" :-J eleemnt");// To check how does loops works //

			}
			
			if(!duplicate)
			{
				unq_count++;
				//System.out.println(arr[i]+"Unique char"+unq_count+":-count"+duplicate);

			}
			else
			{
				dupli_count++;
				System.out.println(arr[i]+"duplicate char"+dupli_count+":-count"+duplicate);

			}
		}
	}

}
