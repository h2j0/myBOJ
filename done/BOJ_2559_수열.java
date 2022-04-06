package BOJ.done;
import java.util.Scanner;

public class BOJ_2559_수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner("10 2\r\n" + "3 -2 -4 -9 0 3 7 13 8 -3");

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;

		for (int i = 0; i <= n - m; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				sum += arr[i + j];
			}
			if (max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
