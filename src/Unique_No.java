import java.util.ArrayList;
//Find how many times does duplicate elements appear in arraylist//
public class Unique_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={4,5,5,5,5,4,3,2,1};
		
		ArrayList<Integer>arr= new ArrayList<Integer>();
		//int k=0; //If we initialize k=0 at global level then it will continue with count 
		for(int i=0;i<a.length;i++)
		{
			int k=0;// It will get refresh and come to starting point that is default k count will b 1 at strt of loop
			if(!arr.contains(a[i]))// It removes duplicates element 
			{
				arr.add(a[i]);
				k++;
				//System.out.println(k+"inside 1st if loop");

				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
						
					}
					//System.out.println(k+"inside 2nd if loop");

				}
				System.out.println(k+"times of redundancy");
				System.out.println(a[i]+"arraylist");
			}
		

		}
		

	}

}
