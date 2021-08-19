import java.util.*;

public class school{
	private int kids = 0;
	private String building = " ";
	
	school(){
	
	}
	school(int i){
		kids = i;
	}
	school(String b){
		building = b;
	}
	shcool(int i, String b){
		kids = i;
		building = b;	
	}
	
	public int getKids(){
		return kids;
	}
	public String getBuilding(){
		return building;
	}
	public void setKids(int i){
		kids = i;
	}
	public void setBuilding(String b){
		building = b;
	}
	
	
	
}
	