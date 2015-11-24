package DesignPatterns;

public class HundredsHandler implements RequestHandler
{
	  private RequestHandler rh; 

 public void handleRequest(Request rq)
 {
	 System.out.println("Hello from Hundred handler");
	 rq.setRemainder(rq.getValue());

	 if((rq.getValue())>100)
	 {
		 System.out.println(">>>>Handling the Hundreds from Hundreds handler");

		 int hun=0;
		 hun=rq.getValue()/100;
		 rq.setHundreds(hun);
		 
		 rq.setRemainder(rq.getValue()%100);
		 
		 if(rq.getRemainder()>0)
		 {
			 System.out.println("Here hundred handler cannot handle Fifties and hence it passes to next object in chain");
			 rh.handleRequest(rq);
		 }
		 else if(rq.getRemainder()==0)
		 {
			 System.out.println("Request handled successfully...!");
		 }
	 }
	 else
	 {
		 System.out.println("Here hundred handler cannot handle Fifties and hence it passes to next object in chain");
		 rh.handleRequest(rq);
	 }
	 
	 
 }

@Override
public void setRequest(RequestHandler rh) {
this.rh=rh;	
}
	
	
}
