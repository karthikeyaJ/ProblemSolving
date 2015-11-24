package DesignPatterns;

public class Atm {

	public static void main(String[] args) {

	  RequestHandler hundredsHandler=new HundredsHandler();
	  RequestHandler fiftiesHandler=new FiftiesHandler();
	  RequestHandler tensHandler=new TensHandler();
	  RequestHandler onesHandler=new OnesHandler();

	  hundredsHandler.setRequest(fiftiesHandler);
	  fiftiesHandler.setRequest(tensHandler);
	  tensHandler.setRequest(onesHandler);
	  
	  Request req=new Request(101,"My Amount");
	  
	  System.out.println("###########################################");
	  System.out.println("Sending the Request to Hundreds handler");
	  System.out.println("###########################################");

      hundredsHandler.handleRequest(req);
      
      System.out.println("\n The number of hundreds are : "+req.getHundreds());
      System.out.println("\n The number of fifties are : "+req.getFifties());
      System.out.println("\n The number of tens are : "+req.getTens());
      System.out.println("\n The number of ones are : "+req.getOnes());

	}
}
