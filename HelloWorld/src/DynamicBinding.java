
 class App {
	public void name(){
		System.out.println("Hello from Base");
		
	}	
}
 
 class Binding extends App
 {
	 public void name(){
		 System.out.println("Hello from Derived");
	 }
	 
	 public void shout(){ 
		 System.out.println("I am shouting");
	 }
	 
 }
 
 public class DynamicBinding
 {
 public static void main(String args[])
 {
	 App app=new App();
	 
	 Binding bd=new Binding();
	 
	 app.name();
	 bd.name();
	 bd.shout();
	 
	 System.out.println("============================\n");
	 
	 //Dynamic binding:“Dynamic binding is a mechanism of binding an appropriate version of a derived class which
	// is inherited from base class with base class object
	
	 //also called upcast
	 app=new Binding();
	 
	app.name();
	 //app.shout(); Not possible
	 
	 //downcast
	Binding bd1=(Binding)app;
	bd1.name();
	bd1.shout();

	 app=new App();
	 //------- Unsafe as it throws run time exception,we cant cast app to binding
		//Binding bd2=(Binding)app;
		//bd2.name();
		//bd2.shout();
 }
 }

