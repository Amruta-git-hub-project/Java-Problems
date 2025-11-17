
public class Missing_No_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int arr[]={3,5,2,1};
	       	int largest=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(largest<arr[i])
				{
					largest=arr[i];
					
				}
				
			}
			System.out.println("largest No are:-"+largest);

	    for(int j=0;j<=largest;j++)
	    {
	        boolean found=false;
	        for(int k=0;k<arr.length;k++)
	        {
	            if(arr[k]==j)
	            {
	                found=true;
	                break;
	            }
	        }
	        
	        if(!found)
	        {
	        System.out.println("Missing No "+j);

	        }
	    }
	}

}
