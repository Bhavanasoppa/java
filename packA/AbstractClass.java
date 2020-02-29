package packA;

public abstract class AbstractClass {
	
	void firstConcurrentMethod(){
		System.out.println("First Concurrent method");
	}
	
	void secondConcurrentMethod(){
		System.out.println("Second Concurrent Method");
	}
	
	abstract public void firstAbstractMethod();
	
	abstract public void secondAbstractMethod();

}
