/**
 * 
 */

/**
 * @author Pankush
 *
 */
public class Divide implements Num_Process {

	int x,y,z;
	public int  cal(int x,int y)
	{
		if(y==0)
		{
			System.out.println("Exception occured");
			return 0;
		}
	Num_Process p=(int d,int f)->d/f;
	z=p.cal(x, y);
	return z;
	}
	}