import java.util.ArrayList;

//FInd the string in Arraylist which starts with "A"
public class String_Starts_with {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name= new ArrayList<String>();
		name.add("Rahul");
		name.add("AMruta");
		name.add("sonya");
		name.add("pranav");
		name.add("Ash");

		FindName(name);
		//Streamfilter(name);
		
	}
	public static void FindName(ArrayList<String> name) 
	{
		int count=0;
		int count1=0;
		char target='A';
		for(int i=0; i<name.size();i++)
		{
			String findname= name.get(i);
			//System.out.println(findname+" total char");
			//in case if we want to find "A" at starting of word//
			if(findname.startsWith("A"))
			{
				count++;
			}
			
			//in case if we want to fing "A" at every word in array//
			if(findname.contains("A") || findname.contains("a"))
				
			{
				count1++;
			}
			
		}
		
		System.out.println(count+"count of A"+count1+":-Total char in all arraylist"); 
	}
	
	public static void Streamfilter(ArrayList<String>name)
	{
		
	}

}
