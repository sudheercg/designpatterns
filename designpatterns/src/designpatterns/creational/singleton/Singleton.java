package designpatterns.creational.singleton;

public class Singleton {
	
	// create a variable ofthe type Singleton
	private static Singleton instance; 
	
	//create a private constructor
	private Singleton(){}
	
	
	// create a method which returns a Singleton object. 
	//this method returns only a single object of Singleton.
	public static Singleton getInstance() {
		
		if(instance ==null) {
			instance = new Singleton();
		}
		return instance; 
		
	}

}
