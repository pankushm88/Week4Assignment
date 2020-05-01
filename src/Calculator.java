	import java.util.HashMap;
	import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 */

/**
 * @author Pankush
 *
 */

public class Calculator {
    //Num_Process addn = Integer::sum;
	    public static void main(String args[]) 
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Please enter two numbers:");
	    	int p=sc.nextInt();
	    	int q=sc.nextInt();
	    	System.out.println("Please Enter 0 for Add, 1 for Subtract,2 for Multiply,3 for Divide");

	    	int r=sc.nextInt();
	    	Map<Integer,Num_Process> m=new HashMap<Integer,Num_Process>();
	    	m.put(0,  new Add());
	    	m.put(1,   new Sub());
	    	m.put(2, new Multiply());
	    	m.put(3,  new Divide());
	    	System.out.println("Output of your calculation is:");
	    	 System.out.println(m.get(r).cal(p, q));
	       
	    }
	
}
