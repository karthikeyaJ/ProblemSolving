import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Fibinocii {

	int findFibinocii(int num)
	{
		if(num==0)return 0;
		if(num==1)return 1;
		
		else if(num>=2)
			
		
		return findFibinocii(num-1)+findFibinocii(num-2);
		return 0;
		
		
	}
	
	public static void main(String[] args)
	{
		int number;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try{
			number=Integer.parseInt(br.readLine());	
int fib=0;
Fibinocii fb=new Fibinocii();
			fib=fb.findFibinocii(number);
			System.out.println(fib);
		}
	    catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
