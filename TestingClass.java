import java.util.*;

public class car{
	private string color = "";
	private int year = "";
	
	car(){
		
	}
	
	car(String c){
		color = c;
	}
	
	car(int y){
		year = y;
	}
	
	car(String C, int y){
		color = c;
		year = y;
	}
	
	public String getColor(){
	return color;	
	}
	public int getYear(){
		return year;
	}
	public String setColor(String c){
		color = c;
	}
	public int setYear(int y){
		year = y;
	}





}