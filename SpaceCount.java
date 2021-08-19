import java.io.*;
import textio.TextIO;

public class SpaceCount {
	public static void main(String[] args){
		String sentence = " ";
		int counter = 0;
		char holder = 'a';
		char space = ' ';


		TextIO.readFile("C:/Users/Andy/OneDrive/Desktop/Java/Spacetest.txt");
			
		while(TextIO.eof()==false){
			sentence = TextIO.getln();
			TextIO.putln(sentence); 
			for(int i = 0; i<sentence.length(); i ++){
				holder = sentence.charAt(i);
				if (holder == space){
					counter ++;
				}
			}
		}
		TextIO.putln("The amount of spaces in this textfile is: "+ counter);
	}
}	