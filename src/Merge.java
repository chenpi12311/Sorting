import java.lang.*;

/**
*自顶向下的归并排序,利用了递归的方法.git 
*/

public class Merge {

	private static Comparable[] aux;

	public static void sort(Comparable[] a) {
		int length = a.length;
		aux = new Comparable[length];
		sort(a,0,length - 1);
	}

	private static void sort(Comparable[] a,int lo,int hi) {
		if (lo >= hi) return; 
		int mid = lo + (hi - lo)/2;
		sort(a,lo,mid);
		sort(a,mid + 1,hi);
		merge(a,lo,mid,hi);
	}

	public static void merge(Comparable[] a,int lo,int mid,int hi) {
		int m = lo,n = mid + 1;
		for (int i = lo;i <= hi;i++) {
			aux[i] = a[i];
		}

		for (int i = lo;i <= hi;i++) {
			if (m > mid) 				  a[i] = aux[n++];
			else if (n > hi) 			  a[i] = aux[m++];
			else if (less(aux[n],aux[m])) a[i] = aux[n++];
			else 						  a[i] = aux[m++];
		}

	}

	public static boolean less(Comparable a,Comparable b) {
		return a.compareTo(b) < 0;		
	}

}
