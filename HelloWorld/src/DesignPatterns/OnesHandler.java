
package DesignPatterns;

public class OnesHandler implements RequestHandler
{

 public void handleRequest(Request rq)
 {
	 System.out.println("\nHello from Ones handler");

	 if((rq.getRemainder())>0)
	 {
		 System.out.println(">>>>Handling the ones from ones handler");

		 int ones=0;
		 ones=rq.getRemainder()%10;
		 rq.setOnes(ones);
		 rq.setRemainder(0);
	 }
	 else if(rq.getRemainder()==0)
	 {
		 System.out.println("Request handled successfully...!");
	 }
	 else
	 {
System.out.println("We cannot handle the request");	

	 }
 }

@Override
public void setRequest(RequestHandler rh) {
//	no request handler to send
}
}




