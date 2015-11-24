
public class ReverseString {

	public String reverse(String string)
	{
		if(string=="" || string.isEmpty())
		{
			return string;
		}
		String rev="";
		
		for(int i=string.length()-1;i>=0;i--)
		{
		rev=rev+string.charAt(i);	
		}
		return rev;
	}
	public static void main(String[] args)
	{
		String name="karthikeya";
		
		ReverseString rs=new ReverseString();
		
		name=rs.reverse(name);
		
		System.out.println(name);
		
	}
	
	
}
