
import textio.TextIO;

public class cmtoinch{

	public static void main(String[] args){
	double i = 0;
	double x = 0; 
	TextIO.put("input a number");
	i = TextIO.getDouble();
	x = i * 0.393701;
	TextIO.putln(i + " cm converts to " + x + " inches.");
	}
}