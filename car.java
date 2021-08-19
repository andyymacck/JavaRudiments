import java.util.*;

public class car{
	private String color = "pee ";
	private int year = 0;
	private String make = "fuck ";
	private double price = 1000.0;
	car(){
		
	}
	
	car(String c){
		color = c;
	}
	
	car(int y){
		year = y;
	}
	
	car(String c, String d){
	color = c;
	make = d;	
	}
	
	car(String c, int y, String d, double p){
		color = c;
		year = y;
		make = d;
		price = p;
	}
	
	public String getColor(){
		return color;	
	}
	public int getYear(){
		return year;
	}
	public String getMake(){
		return make;	
	}
	public double getPrice(){
		return price;	
	}

	public void setColor(String c){
		color = c;
	}
	public void setYear(int y){
		year = y;
	}
	public void setMake(String d){
		make = d;
	}
		public void setPrice(double p){
		price = p;
	}
	public void print(){
	System.out.println("The color of the "+getMake()+" is "+getColor() );
	System.out.println("The year of the " +getMake()+" is "+getYear() );
	System.out.println("The price is " +getPrice());
	System.out.println();
	}
	
}