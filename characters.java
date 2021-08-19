
import textio.TextIO;

public class characters{

	public static void main(String[] args){
	char i = 0;
	TextIO.put("input a character");
	i = TextIO.getChar();
	TextIO.putln(i + " your character is" + i);
	}
}