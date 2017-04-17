import java.lang.*;


public class Shell {
	public static void sort(Comparable[] a,int n) {
		int length = a.length;
		int h = 1;
		while (h < length/n) h = n*h + 1;

		while (h >= 1) {
			for (int i = h;i < length;i++) {
				for (int j = i;j >= h && less(a[j],a[j - h]);j -= h) {
					exch(a,j,j - h);
				}
			}
			h = h/n;
		}
	}

	public static boolean less(Comparable a,Comparable b) {
		int result = -1;
		try {
			result = a.compareTo(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result < 0;
	}

	public static void exch(Comparable[] a,int i,int j) {
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void main (String[] args) {
		String[] a = {"S","H","E","L","L","S","O","R","T","E","X","A","M","P","L","E"};
		sort(a,27);
		for (int i = 0;i < a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
