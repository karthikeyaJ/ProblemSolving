
package DesignPatterns;

public class TensHandler implements RequestHandler
{
	  private RequestHandler rh; 

 public void handleRequest(Request rq)
 {
	 System.out.println("\nHello from Tens handler");

	 if((rq.getRemainder())>=10)
	 {
		 System.out.println(">>>>Handling the tens from tens handler");
		 int ten=0;
		 ten=rq.getRemainder()/10;
		 rq.setTens(ten);
		 rq.setRemainder(rq.getRemainder()%10);

		 if(rq.getRemainder()>0)
		 {
			 System.out.println("Here Tens handler cannot handle ones and hence it passes to next object in chain");
			 rh.handleRequest(rq);
		 }
		 else if(rq.getRemainder()==0)
		 {
			 System.out.println("Request handled successfully...!");
		 }
	 }
	 else
	 {
		 System.out.println("Here Tens handler cannot handle ones and hence it passes to next object in chain");
		 rh.handleRequest(rq);
	 }
 }

@Override
public void setRequest(RequestHandler rh)
{
this.rh=rh;	
}	
}



