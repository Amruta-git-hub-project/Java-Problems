
public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     String sr="I love my coding";// Its only one sentence hence the string count will be only 1
	        String word[]=sr.split(" ");// It will split the sentence into {"I", "love", "my", "coding"}
	    
	    for(int i=0;i<word.length;i++)
	    {
	        int count=word[i].length();//It gives total count of words  
	        String reversed="";
	        System.out.println("count"+count+"totalcount"+i);
	        if(count!=2)// The position of words in given sentence is {"I", "love", "coding"} excluding "my" so it will only reverse only rest words 
	        {
	             for(int j=word[i].length()-1;j>=0;j--)
	        {
	            reversed += word[i].charAt(j);
	            
	        }
	            
	        }
	        else
	        {
	            reversed += word[i];
	        }
	      
	      
	            System.out.print(reversed + " ");
	    }

	}

}
