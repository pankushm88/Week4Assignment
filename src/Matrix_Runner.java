import java.util.Scanner;

/**
 * 
 */

/**
 * @author Pankush
 *
 */
public class Matrix_Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Matrix p=new Matrix(3,3);
		Matrix q=new Matrix(p);
		//Matrix r=new Matrix();
		Matrix s=new Matrix();

		p.readMatrix();//Read 1st matrix
		int d[][]= new int[3][3];
		
		System.out.println("Input scanning matrix 2:");//Read 2nd matrix
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				d[i][j]=sc.nextInt();
			}
		}
		s.define(d);//Defining matrix
		
		System.out.println("1st matrix is:");
	    q.display();//Display matrix
	    System.out.println("Addition of both matrices:");
	   
	    p.add(d);
	    System.out.println("\nCheck if the first matrix is scalar?");
	    s.scalar();
	    System.out.println("Multiplication of both matrices:");
		   
	    p.multiply(d);
		p=null;q=null;s=null;
		System.gc();

	}


}
