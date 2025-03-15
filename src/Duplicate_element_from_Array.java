
public class Duplicate_element_from_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int krb=0;
		int arr1[]={12,34,56,7};
		int arr2[]={7,8,9,12};
		int arr3[]={56,34,12}; 
		int arr1size= arr1.length-1;
		int arr2size=arr2.length-1;
		int arr3size=arr3.length-1;
		int temp1; 
		
		for(int i=0; i<arr1.length;i++)
		{
			temp1=arr1[i];
		
			System.out.println(temp1+"arr1");
		for(int j=0; j<arr2.length;j++)
		{
			temp1=arr2[j]; 
			System.out.println(temp1+"arr2");

			for(int k=0;k<arr3.length;k++)  
			{ 
				temp1=arr3[k]; 
				System.out.println(temp1+"arr3");  

				 if((arr1[i]!=arr2[j]))   
					{  
					 if((arr2[j]!=arr3[k]))
					 {
						 if((arr1[i]!=arr3[k])) 
						 {
							// System.out.println(temp1+"values");

 
						 }
 
					 }
					} 
				 else
					 
				 {
					 break;

				 } 
			
			} 
		
			
		} 
	
		}
 
		
		
	}

}
