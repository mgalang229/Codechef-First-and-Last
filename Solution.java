import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			int max = a[0] + a[n-1];
			for (int i = 0; i < n - 1; i++) {
				max = Math.max(max, a[i] + a[i+1]);
			}
			System.out.println(max);
		}
		fs.close();
	}
}
