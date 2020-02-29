package packC;

import packA.*;
import packB.*;

public class MainClass extends AbstractClass implements InterfaceClass{
	
	
	void firstMainMethod(){
		System.out.println("first main method");
	}
	
	void seconMainMethod(){
		System.out.println("second main method");
	}
	
	public void firstAbstractMethod(){
		System.out.println("firstabstract method implemented in mainclass");
	}
	
	public void secondAbstractMethod(){
		System.out.println("secondAbstract method implemented in mainclass");
	}
	
	public void firstInterfaceMethod(){
		System.out.println("firstInterface method implemented in mainclass");
	}
	
	public void secondInterfaceMethod(){
		System.out.println("second interface method implemented in mainclass");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MainClass mc = new MainClass();
	
	mc.firstMainMethod();
	mc.seconMainMethod();
	
	//calling abstract methods from main class 
	mc.firstAbstractMethod();
	mc.secondAbstractMethod();
	
	
	//calling interfacae methods implemented in main class
	mc.firstInterfaceMethod();
	mc.secondInterfaceMethod();
	
	//calling abstractmethos with abstract reference and main class object
	AbstractClass ac = new MainClass();
	
	ac.firstAbstractMethod();
	
	InterfaceClass ic = new MainClass();
	
	ic.firstInterfaceMethod();
	
	}

}
