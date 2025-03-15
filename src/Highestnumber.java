import java.util.Arrays;

public class Highestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;
		int second=0;
		int highest=0;
		int lowest=0;
		int secondhighest = 0;
		int highestarr[]=new int[6];
		int tempHigh=0;
		//OP: [1000, 500, 100, 80, 70, 10, 9]

		int array1[]={10,80,100,70,1000,700,9};//80,500,
		for(int i=0;i<array1.length;i++)
		{     

			first=array1[i];
			//System.out.println("first---"+  first+"count"+i);  

			for(int j=i+1;j<array1.length;j++) 
			{

				if(array1[i]<array1[j])///10 <80
				{
					tempHigh=array1[i];////10

					array1[i]=array1[j];// 80

					array1[j]=tempHigh;//10
					//highestarr[j] = array1[j];
					//highest=highestarr[j];
					//System.out.println("high"+highest);
					//second=highestarr[j-i];
				}
				secondhighest=array1[j-i];


			} 

			//secondhighest=array1[array1.length-3];//To print the secondhightest no //

		} 

		System.out.println("\n Sorted Records: "+Arrays.toString(array1));//to print all element sorted in array list

		System.out.println("\n 2nd Highest : "+secondhighest);//To print secondhighest no 


	} 

}
