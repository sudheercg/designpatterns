package designpatterns.creational.singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
		/*
		 * Singleton singleton1 = new Singleton(); Singleton singleton2 = new
		 * Singleton(); Singleton singleton3 = new Singleton();
		 */
		
		Singleton  obj1 = Singleton.getInstance();
		
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1==obj2);
	}

}
