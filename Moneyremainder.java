import textio.TextIO;
import java.lang.Math;

public class Moneyremainder{
	public static void main(String[] args){
	double i = 0;
	i = TextIO.getDouble();
	
	//amount of money
	double fiveHundredBill = 0.0;
	double hundredBill = 0.0;
	double fiftyBill = 0.0;
	double twentyBill = 0.0;
	double tenBill = 0.0;
	double fiveBill = 0.0;
	double toonie = 0.0;
	double loonie = 0.0;
	double quarter = 0.0;
	double dime = 0.0;
	double nickle = 0.0;
	double penny = 0.0;
	
	if (i>=500){
		fiveHundredBill = (int)(i/500); 
		i = i%500;
	}
	if(i>=100){
		hundredBill = (int)(i/100.0);
		i = i%100;
	}
	if(i>=50){
		fiftyBill = (int)(i/50.0);
		i = i%50.0;
	}
	if(i>=20){
		twentyBill = (int)(i/20.0);
		i = i%20.0;
	}
	if(i>=10){
		tenBill = (int)(i/10.0);
		i = i%10.00;
	}
	if(i>=5){
		fiveBill = (int)(i/5.0);
		i = i%5.0;
	}
	if(i>=2){
		toonie = (int)(i/2.0);
		i = i%2.0;
	}
	if(i>=1){
		loonie = (int)(i/1.0);
		i = i%1.0;
	}
	if(i>=0.25){
		quarter = (int)(i/0.25);
		i = i%.25;
	}
	if(i>=0.10){
		dime = (int)(i/0.10);
		i = i%0.10;
	}
	if(i>=0.5){
		nickle = (int)(i/0.5);
		i = i%0.5;
	}
	if(i>0.0){
		penny = (int)(i/0.01);
		i = Math.round(i);
		penny++;
	}
	TextIO.putln("$ 500 = "+fiveHundredBill);
	TextIO.putln("$ 100 = "+hundredBill);
	TextIO.putln("$ 50 = "+fiftyBill);
	TextIO.putln("$ 20 = "+twentyBill);
	TextIO.putln("$ 10 = "+tenBill);
	TextIO.putln("$ 5 = "+fiveBill);
	TextIO.putln("$ toonie = "+toonie);
	TextIO.putln("$ loonie = "+loonie);
	TextIO.putln("$ quarter = "+quarter);
	TextIO.putln("$ dime = "+dime);
	TextIO.putln("$ nickle = "+nickle);
	TextIO.putln("$ penny = "+penny);
	
	
	
	}//end of main class
}//end of moneyremainderclass
