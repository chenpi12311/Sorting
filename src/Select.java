import java.lang.*;


public class Select {

	public static void sort(Comparable[] a) {
		int length = a.length;
		for (int i = 0;i < length;i++) {
			int minIndex = min(a,i,length - 1);
			exch(a,i,minIndex);
		}
	}

	public static int min(Comparable[] a,int low,int high) {
		Comparable min = a[low];
		int index = low;
		for (int i = low;i <= high;i++) {
			if (a[i].compareTo(min) < 0) {
				min = a[i];
				index = i;
			}
		}
		return index;
	}

	public static void exch(Comparable[] a,int i,int j) {
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void main(String[] args) {
		Integer[] a = {10,8,20,9,22,92,234,98,6};
		sort(a);
		for(int i = 0;i < a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
