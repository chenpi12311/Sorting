import java.lang.*;

public class Insertion {

	public static void sort(Comparable[] a) {
		for (int i = 1;i < a.length;i++) {
			for (int j = i;j > 0 && less(a[j],a[j-1]);j--) {
				exch(a,j,j-1);
			}
		}
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
		Integer[] a = {21,28,10,294,27,98,76,24,33,1,0,98,4,16,98,56,27,36};
		sort(a);
		for (int i = 0;i < a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
