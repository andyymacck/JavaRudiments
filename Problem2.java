import textio.TextIO;
public class Problem2{
	public static void main(String []args) {
	System.out.println ("This program converts Temperatures from Fahrenheit to Celsius and vice versa.");
	boolean x = true;
		
	while (x == true){
		System.out.print ("Please enter your temperature");
		
		double temp = TextIO.getDouble();
		double temp2 = 0;
		
		TextIO.put("Please enter the units (F/C): ") ;
		char input = TextIO.getChar();
		
		TextIO.putln();
		
		if(input == 'F') {
			temp2 = (temp * 9.0 / 5.0) + 32.0;
			TextIO.put("the temperature of " + temp + " degrees farenheit is equivalent to "+ temp2 + " degrees celsius." );
				
		}
		else if (input == 'C'){
			temp2 = (temp - 32.0 ) * 5.0 / 9.0;
			TextIO.put("the temperature of " + temp + " degrees celsius is equivalent to "+ temp2 + " degrees farenheit." );
				
		}
		else{ 
		TextIO.putln ("Invalid option for input");
		}
		
	
		TextIO.put ("\nDo you wish another conversion? (Y/N): ");
		input = TextIO.getChar();
		if (input == 'N'){
				x = false;
			
		}
	}	
	TextIO.putln ("Thank you. Goodbye.");	
		
		
	}
}
