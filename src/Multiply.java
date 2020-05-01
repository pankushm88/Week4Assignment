/**
 * 
 */

/**
 * @author Pankush
 *
 */
public class Multiply implements Num_Process {

	int x,y,z;
	
	public   int  cal(int x,int y)
	{
	Num_Process p=(int d,int f)->d*f;
	z=p.cal(x, y);
	return z;
	
	}
	}