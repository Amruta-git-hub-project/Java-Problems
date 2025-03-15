
public class Fibonnaci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=1;
int n2=0;
int k=0;
for(int x=0;x<=5;x++)
{
	for(int y=0;y<=x;y++)
	{ 
		
		int r=n1+n2;//
		System.out.print(r+" ");// 
		n1=n2; //
		n2=r;
		
	
		//System.out.print(r+"value");

	}
	
	System.out.println();

}
		
		
	}

}


/* OP  
1
1  2
3  5   8 
13 21  34   55
89 144 233  377  610
*/