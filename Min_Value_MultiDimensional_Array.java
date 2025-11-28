
public class Min_Value_MultiDimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int abc[][]={{2,8,9},{4,6,8},{1,2,5}};
        // Below is the matrix
        // 2 8 9
        //4 6 8
        //0 2 5
        
        int min=abc[0][0];// here it will take 2,8,9 row, since we have to compare the entire array with first row of matrix.
        int num=abc.length;
        //int max=abc[0][0];
        
        int inner=0;
        int col_of_minvalue=0; 
        for(int i=0;i<num;i++)
        {
         //.out.println(num+"num lenght");
         for(int j=0;j<abc[i].length;j++)
         {
             //System.out.println(num+"num lenght");
            inner=abc[i][j];
            //System.out.println(inner+":- array"+i+":-index");
            
            if(inner<min)
            {
                min=inner;
                col_of_minvalue=j;
            }
          
         }
         

        }
         System.out.println(min+"Minimum value"+col_of_minvalue+"colum of minimum value"); 
        
         int max=abc[0][col_of_minvalue];
         //***Either for loop or while loop below is the logic of "for" and "while" loop  ***//
         
			/*
			 * for(int k=0;k<num;k++) { if(abc[k][col_of_minvalue]>max) {
			 * max=abc[k][col_of_minvalue]; } } System.out.println(max+"max row");
			 */
         
         //Now using While loop//
         
         int f=0;
         while( f<num)
         {
        	 if(abc[f][col_of_minvalue]>max)
        	 {
        		 max=abc[f][col_of_minvalue];
        	 }
        	 f++;
         }
         System.out.println(max+"max row");

	}

}
