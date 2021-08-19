
import textio.TextIO;

public class biggestnumber{

	public static void main(String[] args){
	int y = 100;
	int z = 10;
	int q = 1;
	TextIO.putln("Biggest of 3 numbers is");
	
		if(y<z){
			  // Z is bigger than y	
			if(z<q){
			  //q is bigger than z	
				TextIO.putln(q + " is bigger than " + y + " & " + z);
			}
			else{
			 //z is bigger than q
				TextIO.putln(z + " is bigger than " + q + " & " + y);	
			}
		}	
		else{
			  // y is bigger than z
			if(y<q){
			  //q is bigger than y
				TextIO.putln(q + " is bigger than " + z + " & " + y);  
			}
			else{
			//y is bigger than q
				TextIO.putln(y + " is bigger than " + z + " & " + q);
			}
		}
	}
}