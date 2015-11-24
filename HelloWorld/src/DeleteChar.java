
public class DeleteChar {

	@SuppressWarnings("null")
	public String deleteChar(String string,char c)
	{
		if(string=="" || string.isEmpty())
		{
			return null;
		}
		String rev="";
		int len=string.length();
		char[] ch=new char[len];
		
		ch=string.toCharArray();
		
		for(int i=0;i<len;i++)
		{
			if(ch[i]==c)
			{
				ch[i]=' ';	
			}
			
		}
		
		String converted=String.valueOf(ch);
		converted=converted.replaceAll("\\s", "");
		return converted;
	}
	public static void main(String[] args)
	{
		String name="karthikeya";
		char del='k';
		
		DeleteChar dc=new DeleteChar();
		
		String new_string=null;
		new_string=dc.deleteChar(name,del);
		System.out.println(new_string);
		
	}
	
	
}
