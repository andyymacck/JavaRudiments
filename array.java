public class array {
	public static void main(String[] args){
		for(int i =  0; i < 13; i++){
			System.out.print(i + "\t|");
			
			for(int j = 0; j < 13; j++) {
					if(i == 0) {
						System.out.print(j);
					}
					else{
						System.out.print(i*j);
					}
					System.out.print("\t|");
				
			}
			System.out.println();
		}
	
	
	
	}
}