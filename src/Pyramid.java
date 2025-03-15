
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
	    for (int i = 0; i < 15; i++) {
	        for (int j = 0; j < 15 - i; j++) {
	            System.out.print(" ");
	        }
	        for (int k = 0; k <= i; k++) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
		
	}

}
