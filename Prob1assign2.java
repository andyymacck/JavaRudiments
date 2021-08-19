import textio.TextIO;

Public class animal{
	void sound(){	
		textio.putln ("An animal makes a sound based on the animal that it is.");  //default animal noise
	}
	animal(){
		textio.putln ("I am an animal");  //create a new instance of class animal
	}		
}	

class pig extends animal{
	void sound(){	
		textio.putln ("oink");  //pig noise
	}
	animal(){
		textio.putln ("I am a pig");  //create a new instance of pig class
	}			
}	

class sheep extends animal{
	void sound(){	
		textio.putln ("baah");  //sheep noise
	}
	animal(){
		textio.putln ("I am a pig");  //create a new instance of sheep class
	}			
}	

class duck extends animal{
	void sound(){	
		textio.putln ("quack");  //pig noise
	}
	animal(){
		textio.putln ("I am a duck");  //create a new instance of duck class
	}			
}	

class cow extends animal{
	void sound(){	
		textio.putln ("moo");  //pig noise
	}
	animal(){
		textio.putln ("I am a cow");  //create a new instance of cow class
	}			
}	

Public static void main (String[] args){
	animal a;
	pig b;
	sheep c;
	duck d;
	cow e;
	
}
