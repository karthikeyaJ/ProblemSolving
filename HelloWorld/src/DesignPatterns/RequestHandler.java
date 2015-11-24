package DesignPatterns;

public interface RequestHandler {
  
  public void setRequest(RequestHandler rh);
  public void handleRequest(Request rq);	
}
