import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

   public static void main(String[] args) {
       /**
       * We will be using prompt to ask user to enter the name of the file.
       *
       * Using Scanner class to take input from the user
       * */
       Scanner sc = new Scanner(System.in);
      
       /**
       * An String variable named fileName is declared below.
       * Another String variable named line is also declared
       * */
       String fileName,line;
      
       /**
       * An integer variable named count is declared and initialized to 0
       * Note: count variable will be used to store the total words
       * */
       int count = 0;
      
       /**
       * Prompting user to enter the name of the file
       * */
       System.out.print("Enter name of the file: ");
      
       /**
       * Scanning the name of the file in fileName variable
       * */
       fileName = sc.nextLine();
      
       /**
       * Another Scanner class object named fileScan is declared below
       * to take data form file
       * */
       try {
           Scanner scanFile = new Scanner(new File(fileName));
           /**
           * Using while loop to scan each line from the file
           * */
           while(scanFile.hasNext()) {
               /**
               * Scanning current line in variable line
               * */
               line = scanFile.nextLine();
               /**
               * Using trim() function to remove any spaces at start and end of line
               * if present. For example if line = " hello world "; then trim()
               * will update line="hello world"
               * */
               line = line.trim();
               /**
               * Converting line into String array.
               * The size of the array words[] gives number of words.
               * */
               String[] words = line.split("\\s+");
               /**
               * Adding words.length into count.
               * */
               count = count + words.length;
           }/*While loop ends here*/
           System.out.println("Total words are "+count);
          
       } catch (FileNotFoundException e) {
           System.out.println("File not found!");
       }

   }

}