package DesignPatterns;

public class Request {	
	private int value;
	private String description;
	private int hundreds,fifties,tens,ones,remainder;
	
	public Request(int value,String description)
	{
		this.value=value;
		this.description=description;
	}
	  
	public int getRemainder()
	{
	    return remainder;
	}
	
	  public int getHundreds()
	  {
		  return hundreds;
	  }
	  public int getFifties()
	  {
		  return fifties;
	  }
	  public int getTens()
	  {
		  return tens;
	  }
	  public int getOnes()
	  {
		  return ones;
	  }
	 
	  public void setRemainder(int rem)
	  {
		  remainder=rem;
	  }
	  
	  
	  public void setHundreds(int hun)
	  {
		  hundreds=hun;
	  }
	  
	  public void setOnes(int one)
	  {
		   ones=one;
	  }
	  
	  public void setTens(int ten)
	  {
		   tens=ten;
	  }

	  public void setFifties(int fifty)
	  {
		  fifties=fifty;
	  }

	  public int getValue(){
		return value;
	  }
	  
	  public String getDescription(){
		return description;
	  }

	}
