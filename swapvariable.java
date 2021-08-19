
import textio.TextIO;

public class swapvariable{

	public static void main(String[] args){
	int x = 5;
	int y = 9;
	TextIO.putln("Swap variables ");
	 int z = x;
	 x = y;
	 y = z;
	TextIO.putln("x = " + x);
	}
}