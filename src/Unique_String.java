
public class Unique_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="pppfdfda"; 
		String dupli="";
		for(int i=0;i<name.length();i++)
		{
			String outer=dupli+name.charAt(i);
			//System.out.println(outer+"lenght");

			for(int j=i+1;j<name.length();)//p,p,f 
			{
				if(name.charAt(i)==name.charAt(j) )
				{
					System.out.println(" "+"space");
				}
				
				else
				{
					System.out.println(name.charAt(j)+"unique");
				}
				break;
			}
			
		}

	}

}

/*
input String= ppfda
 o/p= fda



*/