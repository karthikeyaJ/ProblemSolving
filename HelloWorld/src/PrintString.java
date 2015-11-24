
public class PrintString {
	int i=0;
	public String recursive(String string)
	{
		 if (string == null || string.equals(""))
		    {
		        return string;
		    }
		 else
		 {
			 System.out.println(string.charAt(0));
			 return recursive(string.substring(1, string.length()));
			 
		 }
	}
		
	
	public void iterative(String string)
	{
		
	}
	public static void main(String[] args)
	{
		String name="karthikeya";
		
		PrintString ps=new PrintString();
		String new_name=null;
		new_name=ps.recursive(name);
		
		ps.iterative(name);
		
	}
	
	
}
