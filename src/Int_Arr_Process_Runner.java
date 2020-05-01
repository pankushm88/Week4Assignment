/**
 * 
 */

/**
 * @author Pankush
 *
 */
public class Int_Arr_Process_Runner {
      public static void main(String[] args) {
		Int_Arr_Process p=new Int_Arr_Process(5);
		Int_Arr_Process q=new Int_Arr_Process(p);
		Int_Arr_Process r=new Int_Arr_Process();
		System.out.println("scanning P array");//5 elements
		p.readArray();

		System.out.println("scanning R array");//10 elements
	    r.readArray();
	    System.out.println("Q array in horizontal is:");
		q.displayHorizontal();
		System.out.println("\nP array in vertical is");
		p.displayvertical();
		System.out.println("Sorted R array in horizontal is");
		r.Sort();r.displayHorizontal();
		System.out.println("\nLargest element of Q array is");
		q.biggest();
		System.out.println("smallest element of P array is");
		p.smallest();
		System.out.println(" Second largest element of P array is");
		q.secondlargest();
		System.out.println("sum of elements of P array is");
		p.sum();
		p=null;q=null;r=null;
		System.gc();
	}

}