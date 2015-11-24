import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashApp {
public static void main(String args[]){
	 HashMap<String,Double> hm = new HashMap<String,Double>();
     // Put elements to the map
	   hm.put("Zara", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
// using for to print
      
         for(Map.Entry<String, Double> entry:hm.entrySet())
         {
        	 String key=entry.getKey();
        	 Double value=entry.getValue();
        	 System.out.println("key is: "+key+"value is: "+value);
         }
 //using iterator to print        
         Iterator it=hm.entrySet().iterator();

    	 System.out.println("#############################################################################");

         while(it.hasNext())
         {
        	Map.Entry<String, Double> entry=(Entry<String, Double>) it.next();
        	String key=entry.getKey();
        	Double value=hm.get(key);
       	 System.out.println("key is: "+key+" value is: "+value);
        	 
         }
    	   
       

}
}
