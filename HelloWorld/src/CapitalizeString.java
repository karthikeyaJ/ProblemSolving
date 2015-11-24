
public class CapitalizeString {

	public static String[] Capitalise(String[] str)
	{
		System.out.println(str.length);
		for(int i=0;i<str.length;i++)
		{
			str[i]=lowerCase(str[i]);
		}
		for(int i=0;i<str.length;i++)
		{
System.out.println(str[i]);		
		
		str[i]=CapsLock(str[i]);
		}
		
		
		return str;
	}
	
	
	public static String lowerCase(String str)
	{
		return str.toLowerCase();
	}
	
	public static String CapsLock(String str)
	{
		StringBuffer sb=new StringBuffer();
		
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
		sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
		}
				return sb.toString().trim();
	}
	
	
	public static void main(String[] args)
	{
		String[] cap=new String[2];
		cap[0]="i am a GOOD boy";
		cap[1]="doNt you think SO";
		String[] newCap=new String[cap.length];
				newCap=Capitalise(cap);
		System.out.println("completed");
		
		
	}
	
	
	
	
}
