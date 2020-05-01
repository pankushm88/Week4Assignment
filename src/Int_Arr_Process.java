/**
 * 
 */

/**
 * @author Pankush
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process {
int size=10,a[];
Scanner s = new Scanner(System.in);
	
	public Int_Arr_Process()
	{
		
		a=new int[size];
	}
	public Int_Arr_Process(int size)
	{
		this.size=size;
		a=new int [size];
	}
	public void define(int arr[] )//Define integer array
	{
		size=arr.length;
		a=new int [arr.length];
		a=arr;
	}
	public Int_Arr_Process(Int_Arr_Process p)//Copy Constructor
	{
		size=p.size;
		a=p.a;
		
	}
	public void readArray()//Fn to read array
	{
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
	}
	public void displayHorizontal()
	{
		for(int i=0;i<size;i++)
		{
			System.out.printf("%d ",a[i]);
		}
	}
	public void displayvertical()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
	public void Sort()
	{
		Arrays.sort(a);
	
		
	}
	public void biggest()
	{
		Sort();
		System.out.println(a[size-1]);
	}
	public void smallest()
	{
		Sort();
		System.out.println(a[0]);
	
	}
	public void secondlargest()
	{
		int c=1;
		for(int i=size-2;i>=0;i--)
		{
			if(a[i]!=a[size-1])
				{System.out.println(a[i]);c=0;break;}
		}
		if(c==1)
			System.out.println("second largest not exist");
		
	}

	public void sum()
	{int sum = 0;
		for(int i:a)
		{
			sum=sum + i;
		}System.out.println(sum);
	}
	public void finalize()
	{
		size=0;
		a=null;
		System.out.println("Destructor called");
	}
}