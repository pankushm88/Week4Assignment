import java.util.Scanner;

/**
 * 
 */

/**
 * @author Pankush
 *
 */
public class Matrix {
	
	int row,col,arr[][];
	Scanner sc = new Scanner(System.in);
	public Matrix()
	{
		row=3;col=3;
		arr=new int[row][col];
	}
	public Matrix(int row)
	{
		this.row=row;this.col=row;
		arr=new int[row][col];
	}
	public Matrix(int row,int col)
	{
		this.row=row;
		this.col=col;
		arr=new int[row][col];
	}
	public void define(int p[][])
	{
		row=p.length;
		col=p[0].length;
		arr=new int [row][col];
		arr=p;
	}
	public Matrix(Matrix p)
	{
		row=p.row;
		col=p.col;
		arr=new int [row][col];
		arr=p.arr;
	}
	public void readMatrix()
	{
		System.out.println("Input scanning matrix 1");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				arr[i][j]=sc.nextInt();
		}
	}
	public void display()
	{
		System.out.println(" ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.printf("%d ",arr[i][j]);
		System.out.println();
		}
		
	}
	public void add(int d[][])
	{int res[][]=new int [row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				res[i][j]=arr[i][j]+d[i][j];
		
		}
		display(); 
	}
	public void scalar()
	{
int p = 0, q = 0, x = arr[0][0]; // 'x' is storing the 1st main diagonal element
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			    /* Checking that the matrix is diagonal or not */
				if(i!=j && arr[i][j]!=0) // All non-diagonal elements must be zero
				{
					p=1;
					break;
				}
				/* Checking the matrix for scalarity */
				// All main diagonal elements must be equal to 'x' and non-zero
				if(i==j && (arr[i][j]==0 || arr[i][j]!=x)) 
				{
					q=1;
					break;
				}
		    }
		}
		
		if(p==0 && q==0)
			System.out.println("The matrix is scalar");
		else
			System.out.println("The matrix is not scalar");
		
	}
	public void multiply(int d[][])
	{
		int x[][]=null;
		x=new int[row][d[0].length];
		int i, j, k; 
        for (i = 0; i < row; i++) 
        { 
            for (j = 0; j < d[0].length; j++) 
            { 
                x[i][j] = 0; 
                for (k = 0; k < col; k++) 
                    x[i][j] += arr[i][k]  
                                * d[k][j]; 
            } 
        } 
		//System.out.println(d[0].length);
		/*for(int  i=0;i<row;i++)
		{
			for(int j=0;j<d[0].length;j++)
			{
				for(int k=0;k<col;k++)
				{
					x[i][j]+=arr[i][k]*d[k][j];
				}
			}
		}*/
		define(x);
		display();

	}
	public void finalize()
	{
		row=0;col=0;
		arr=null;
		System.out.println("Destructor called");
	}
    
}