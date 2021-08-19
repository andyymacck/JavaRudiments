import java.util.Scanner;

class BubbleSortExample {
  public static void main(String []args) {
    int num, i, j, temp;
	Scanner input = new Scanner(System.in)
	
	System.out.println("enter the number of integers to sort:");
	num = input.nextInt();
	
	int array[] = new int[num];
	
	System.out.println("Enter " + num + " integers: ");
	
	for (i = 0; i < num; i++)
	  array[i] = input.nextInt();
	