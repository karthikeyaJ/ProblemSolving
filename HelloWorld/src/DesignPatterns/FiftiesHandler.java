	
	package DesignPatterns;

	public class FiftiesHandler implements RequestHandler
	{
		  private RequestHandler rh; 

	 public void handleRequest(Request rq)
	 {
		 System.out.println("\nHello from Fities handler");

		 if(((rq.getValue()%100)/50)>=1)
		 {
			 System.out.println(">>>>Handling the fifties from fifties handler");
			 int fif=0;
			 fif=(rq.getRemainder())/50;
			 rq.setFifties(fif); 
			 rq.setRemainder(rq.getRemainder()%50);
			 if(rq.getRemainder()>0)
			 {
				 System.out.println("Here fifties handler cannot handle tens and hence it passes to next object in chain");
				 rh.handleRequest(rq);
			 }
			 else if(rq.getRemainder()==0)
			 {
				 System.out.println("Request handled successfully...!");
			 }
		 }
		 else
		 {
			 System.out.println("Here fifties handler cannot handle tens and hence it passes to next object in chain");
			 rh.handleRequest(rq);
		 }
	 }

	@Override
	public void setRequest(RequestHandler rh)
	{
	this.rh=rh;	
	}	
	}



