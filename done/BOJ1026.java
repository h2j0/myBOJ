package BOJ.done;

//1026 보물
import java.util.Scanner;

public class BOJ1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int tmp;
				if (arr1[i] > arr1[j]) {
					tmp = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = tmp;
				} else
					continue;
			}

		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int tmp;
				if (arr2[i] < arr2[j]) {
					tmp = arr2[j];
					arr2[j] = arr2[i];
					arr2[i] = tmp;
				} else
					continue;
			}

		}
		int sum = 0;
		for (int i = 0; i < n; i++) {

			sum += arr1[i] * arr2[i];
		}

		System.out.print(sum);

	}
}
