package Selenium_WebDriver;

public class Try_Catch_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String name="amruta";
			String name1=null;
			System.out.println(name1.length());
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("1st block"); 

		}
		try{
			int num=100;
			int sum=num/0;
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("2nd block");

		}
		finally{
			System.out.println("FInaly");
		}
	}

}
