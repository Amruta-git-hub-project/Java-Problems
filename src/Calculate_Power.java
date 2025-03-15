
public class Calculate_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int power=9;
		
		//System.out.println(calculate_power(n,power));
		
		int pwer=calculate_power(n,power);
		System.out.println("Power of number is"+pwer); 
	}
	
	public static  int  calculate_power(int n, int power)
	{
		int temp = 0;
		for(int k=0;k<power;k++)
		{
			temp=temp+n*k;
		}
		return temp;
	}
	
	/*public static void print_power(int temp)
	{
		System.out.println("Power of number is "+temp);
	}*/

}
