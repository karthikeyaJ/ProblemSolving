import java.util.ArrayList;

class Machine{
	public String mac_name;
	
}

class Bike extends Machine{}



public class Wildcard {

	public static void main(String[] args)
	{
		//calling appropriate methods
	ArrayList<String> arr= new ArrayList<>();
	arr.add("Karthik");
	arr.add("Sravan");
	//showList(arr);
	
	//calling appropriate method which takes machine type as param
	ArrayList<Machine> mac=new ArrayList<>();
	Machine apple = new Machine() ;
	apple.mac_name="Apple";
	mac.add(apple);
	Machine google=new Machine();
	google.mac_name="Google";
	mac.add(google);
	//showList2(mac);
	
	ArrayList<String> arr2= new ArrayList<>();
	arr.add("Syracuse");
	arr.add("University");
	showGenericList(arr2);
	
	ArrayList<Machine> mac2=new ArrayList<>();
	Machine apple2 = new Machine() ;
	apple.mac_name="Apple2";
	mac.add(apple2);
	Machine google2=new Machine();
	google.mac_name="Google2";
	mac.add(google2);
	showGenericList(mac2);

	
	
	}
	public static void showList2(ArrayList<Machine> list2)
	{
		for(Machine val:list2)
		{
			System.out.println(val.mac_name);
		}
		
	}
	
	
	public static void showList(ArrayList<String> list)
	{
		for(String val:list)
		{
			System.out.println(val);
		}
	}
	
	public static void showGenericList(ArrayList<?> list)
	{
		for(Object val:list)
		{
			Machine m=(Machine)val;
			System.out.println(m.mac_name);
		}
	}
	
}
