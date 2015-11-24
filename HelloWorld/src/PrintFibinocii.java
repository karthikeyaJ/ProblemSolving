import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrintFibinocii {

	public static void main(String[] args)
	{
		int number;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try{
			number=Integer.parseInt(br.readLine());	
			int[] memo=new int[number+1];
            
			for(int i=0;i<number;i++)
			{
				System.out.println(i +" fibinocii is: "+ fib(i,memo));
			}
			
		}
	    catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static int fib(int i,int[] memo)
	{
		if(i==0) return 0;
		else if(i==1) return 1;
		else if(memo[i]>0) return memo[i];
		memo[i]= fib(i-1,memo)+fib(i-2,memo);
		return memo[i];
	}
	
	
	
	
	
}
