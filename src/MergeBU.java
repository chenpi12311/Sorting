import java.lang.*;

/**
* 自底向上的归并排序,利用了循环来进行排序,并且更加的适用于链表
*/

public class MergeBU {

	private static Comparable[] aux;

	public static void sort(Comparable[] a) {
		int N = a.length;
		aux = new Comparable[N];
		for (int sz = 1;sz < N;sz = sz + sz) {
			for (int lo = 0;lo < N - sz;lo += sz + sz) {
				merge(a,lo,lo + sz - 1,Math.min(lo+sz+sz-1,N-1));
			}
		}
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

	public static void main(String[] args) {
		String[] a = {"M","E","R","G","E","S","O","R","T","E","X","A","M","P","L","E"};
		sort(a);
		for (String s : a) {
			System.out.print(s + " ");
		}
	}

}
