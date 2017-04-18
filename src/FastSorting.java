import java.lang.*;


public class FastSorting {

	public static void sort(Comparable[] a) {		
		sort(a,0,a.length - 1);
	}

	private static void sort(Comparable[] a,int lo,int hi) {
		if (lo >= hi) return;
		int j = partition(a,lo,hi);
		sort(a,lo,j - 1);
		sort(a,j + 1,hi);
	}

	public static int partition(Comparable[] a,int lo,int hi) {
		int i = lo,j = hi + 1;
		Comparable v = a[lo];
		while (true) {
			while (less(a[++i],v)) if (i == hi) break;
			while (less(v,a[--j])) if (j == lo) break;
			if (i >= j) break;
			exch(a,i,j);  
		}
		exch(a,lo,j);
		return j;
	}

	public static boolean less(Comparable a,Comparable b) {
		return a.compareTo(b) < 0;
	}

	public static void exch(Comparable[] a,int i,int j) {
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void main(String[] args) {
		Integer[] a = {51,29,475,2145,24512,241,245,987,285,75,254,84,391,576,29};
		sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
