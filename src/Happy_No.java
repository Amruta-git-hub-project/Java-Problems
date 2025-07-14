import java.util.HashSet;
import java.util.Set;

public class Happy_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=19;
		
		//Happy_Nos(n);
		ChatGPT_Happy_Nos(n);

	}
	
	public static void Happy_Nos(int n)
	{
		int a=0;
		int b=0;
		int c=0;
		int sum=0;
		boolean flag=false;
		
		b=n/10;
		a=n%10;
		c+=(a*a)+(b*b);
		sum=c;
	
		Set<Integer>set1= new HashSet<>();
		int i=0;
		//while(sum!=1 )
		while(sum!=1 && !set1.contains(sum))
		{
			set1.add(sum);
		
		if(n>0 && flag==false)
		{
			sum=0;
			b=c/10;
			a=c%10;
			sum+=(a*a)+(b*b);
			System.out.println((a*a)+(b*b));

			c=sum;
			
			//i++;
			System.out.println(a+"remainder" +b+"dividend");
			System.out.println(sum+"sum");
			System.out.println(c+"result");
		}
		
		else
		{
			flag=true;
		}
				
		}
		System.out.println(set1+"set1");
		
		//return n;
		
	}

	public static void ChatGPT_Happy_Nos(int n)
	{
		int sum = 0;
        boolean flag = false;

        int temp = n;

        // To avoid infinite loop for non-happy numbers
        for (int i = 0; i < 100; i++) {
            sum = 0;

            // Sum of squares of digits
            while (temp > 0) {
                int a = temp % 10;       // get last digit of no  --1st iteration-- 82%10=2,--2nd iteration-- 8%10=8
                sum += a * a;            // square it and add it --1st iteration--2*2=4,--2nd iteration--  8*8
                temp /= 10;              // remove last digit --1st iteration-- 82/10=8,--2nd iteration-- 8/10=0
              //sum=4+64=68

            }

            System.out.println("Sum of squares: " + sum);

            if (sum == 1) {
                flag = true;
                break;
            }

            temp = sum;  // Repeat with new number
        }

        if (flag)
            System.out.println("It's a Happy Number!"+flag);
        else
            System.out.println("Not a Happy Number."+flag);
	}

}
