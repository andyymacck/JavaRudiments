
/**
 * title: multiplicationtable 
 * description: An example of javadoc use and proper code documentation
 * date: April 15th, 2021
 * @author Andrew Mackay
 * @version 1.0
 * @copyright Andrew Mackay
*/
 
/**
input data: 
 
expected ouput:

*/ 
import textio.TextIO;
	public class multiplicationtable{
		
		
		public static void main(String[] args){
		for(int i = 0; i<=12; i ++) {
			if(i == 0){
			TextIO.put("\t" + " " );
			
		
			}
			else{
			TextIO.put("\t" + i );		
			}
			TextIO.put ("\t"+"|");
			
		}
		TextIO.putln();
		for(int i = 1; i<=12; i ++) {
			TextIO.put("\t"+i+ "|");
				for(int j = 1; j<=12; j ++ ) {
				TextIO.put ("\t"+i * j);
																	
				
				}
				TextIO.putln();
		}
	}
	}