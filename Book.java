import textio.TextIO;

public class Book{
	//Member Variables*
	private String title = " ";				//The title of the Book
	private String ISBNnumber = " ";			//The international standard Book number
	private String author = " ";				//The author of Book
	private int edition = 0;				//The edition of Book
	private String publisher = " "; 		//The publisher of Book
	private int yearPublication	= 0;		//The year of publication
	
	/**
	*	Create a new instance of class Book. Initialize instance
	* 	as a default constructor 
	*/
	public Book(){	
		
	}
	
	/**
	*	Create a new instance of class Book. Initialize instance
	* 	title variable to values of the argument passed through	
	*	the constructor parameters.
	*	@parameter t -> the title of the book.
	*/
	public Book(String t){	
		title = t;
	}
	
	/**
	*	Create a new instance of class Book. Initialize instance
	* 	title, ISBNnumber variables to values of the argument passed through	
	*	the constructor parameters.
	*	@parameter t -> the title of the book.
	*	@parameter i -> the international standard Book number.
	*/
	public Book(String t,String i){	
		title = t;
		ISBNnumber = i;
	}
	
	/**
	*	Create a new instance of class Book. Initialize instance
	* 	title, ISBNnumber, author, edition, publisher, publication year 
	*	variables to values of the argument passed through	
	*	the constructor parameters.
	*	@parameter t -> the title of the book.
	*	@parameter i -> the international standard Book number.
	*	@paramter a -> the author of the book
	*	@paramter e -> the edition of the book
	*   @parameter p -> the publisher of the book
	*   @parameter y -> the year of the publication
	*/
	
	public Book(String t,String i, String a, int e, String p, int y){
		title = t;
		ISBNnumber = i;
		author = a;
		edition = e;
		publisher = p;
		yearPublication = y;
	}
	 /**
	 * returns the title of the book
	 * 
	 * return title(String)
	 */ 
	 public String getTitle(){
		return title;  
	 }
	 
	 
	 
	 
	 /**
	 * set title to the value passed through the parameter
	 * @parameter t -> title
	 * return void
	 */
	 public void setTitle(String t){
		title = t;
	}
	 


	 /**
	 * returns the ISBNnumber of the book
	 * 
	 * return ISBNnumber(String)
	 */ 
	 public String getISBNnumber(){
		return ISBNnumber;  
	 }
	 
	 
	 
	 
	 /**
	 * set ISBNnumber to the value passed through the parameter
	 * @parameter i -> ISBNnumber
	 * return void
	 */
	 public void setISBNnumber(String i){
		ISBNnumber = i;
	}
	 

	 /**
	 * returns the author of the book
	 * 
	 * return author(String)
	 */ 
	 public String getAuthor(){
		return author;  
	 }
	 
	 /**
	 * set author to the value passed through the parameter
	 * @parameter a -> author
	 * return void
	 */
	 public void setAuthor(String a){
		author = a;
	} 
	 /**
	 * set author to the value passed through the parameter
	 * @parameter e -> edition
	 * return void
	 */
	 public int getEdition(){
		return edition;  
	 }
	 
	 /**
	 * set author to the value passed through the parameter
	 * @parameter e -> edition
	 * return void
	 */
	 public void setEdition(int e){
		edition = e; 
	 }
	 	 /**
	 * set Publisher to the value passed through the parameter
	 * @parameter p -> publisher
	 * return void
	 */
	 public String getPublisher(){
		return publisher;  
	 }
	 
	 /**
	 * set Publisher to the value passed through the parameter
	 * @parameter p -> Publisher
	 * return void
	 */
	 public void setPublisher(String p){
		publisher = p; 
	 }
	 	 	 /**
	 * set yearPublication to the value passed through the parameter
	 * @parameter y -> yearPublication
	 * return void
	 */
	 public int getYearPublication(){
		return yearPublication;  
	 }
	 
	 /**
	 * set yearPublication to the value passed through the parameter
	 * @parameter y -> yearPublication
	 * return void
	 */
	 public void setYearPublication(int y){
		yearPublication = y; 
	 }	 
	public void print(){
		if(getTitle()!= " " ){TextIO.putln("Title: \t\t\t" + getTitle());}
		if(getAuthor()!= " " ){TextIO.putln("Author: \t\t" + getAuthor());}
		if(getEdition()!= 0 ){TextIO.putln("Edition: \t\t" + getEdition());}
		if(getISBNnumber()!= " "){TextIO.putln("ISBNnumber: \t\t" + getISBNnumber());}
		if(getPublisher()!= " "){TextIO.putln("Publisher: \t\t" + getPublisher());}
		if(getYearPublication()!= 0){TextIO.putln("Year of Publication: \t" +getYearPublication());} 
		TextIO.putln ();
		
		
	}
	
	 
	 
	 
	 
/** end of code
*/	 
}
	