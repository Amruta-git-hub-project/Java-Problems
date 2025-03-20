
public class Find_first_last_postion_sortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={5,7,7,8,8,10};
		int target=8;
		
		for(int i=0;i<arr1.length;i++)
		{
			//int pos=arr1[i];
			if(target==arr1[i])
			{
				System.out.println(i+"position");
			}
		}
	}

}
