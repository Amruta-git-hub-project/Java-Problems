import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two_Duplicate_Items {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//------Only two duplicate items is allowed-----//
		int arr1[]={0,0,1,1,1,1,1,2,3,3,3};
		int count=0;
		int a=0;
		int b=0;
		int c=0;
		boolean flag= false;
		List<Integer>list1= new ArrayList();
		for(int i=0;i<arr1.length;i++)
		{
			//int count=arr1[i];
			a=arr1[i];
			for(int j=i+1;j<arr1.length;j++)
			{
				b=arr1[j];
				if(a==b)
				{
					flag=true;
					//System.out.println(a+":first:-"+i+"pos"+b+":second:-"+j+"possec");
					list1.add(arr1[j]);
					
					//count++;

				}
			
				break;



			}
			i++;
			//list1.add(arr1[i]);

		
		}
		System.out.println(list1+"ee");

	}
//--------Currently its counting two duplicate elements as one--------------//
}
