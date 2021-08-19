
import textio.TextIO;

public class addingnumbers{

	public static void main(String[] args){
	int x = 0;
	int y = 0;

	TextIO.putln("input first number ");
	x = TextIO.getInt();
	TextIO.putln("input second number ");
	y = TextIO.getInt();
	
	int sum = x + y;
	TextIO.putln("The first number is " + x + " and the second is " + y);
	TextIO.putln("The sum of this number is" + sum);
	}
}