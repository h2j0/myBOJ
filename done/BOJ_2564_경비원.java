package BOJ.done;
import java.util.Scanner;

public class BOJ_2564_경비원 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner("10 5\r\n" + "3\r\n" + "1 4\r\n" + "3 2\r\n" + "2 8\r\n" + "2 3");
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n * 2];
		int[] x = new int[2];
		for (int i = 0; i < n * 2; i++) {
			arr[i] = sc.nextInt();
		}
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < n * 2; i+=2) {
//			System.out.println(i);
			boolean flag = false;
			if (arr[i] == x[0]) {
				sum += Math.abs(arr[i+1] - x[1]);
				flag = true;
			}
			if (!flag) {
//				System.out.println(i);
				switch (x[0]) {
				case 1: //북
					switch (arr[i]) {
					case 2:
						sum += (Math.min(x[1] + arr[i+1], 2 * w - (x[1] + arr[i+1])) + h);
						break;
					case 3:
						sum += (x[1] + arr[i+1]);
						break;
					case 4:
						sum += (w - x[1] + arr[i+1]);
						break;
					}
					break;

				case 2: //남
					switch (arr[i]) {
					case 1:
						sum += (Math.min(x[1] + arr[i+1], 2 * w - (x[1] + arr[i+1])) + h);
						break;
					case 3:
						sum += (x[1] + h - arr[i+1]);
						break;
					case 4:
						sum += (w - x[1] + h - arr[i+1]);
						break;
					}
					break;

				case 3: //서
					switch (arr[i]) {
					case 4:
						sum += (Math.min(x[1] + arr[i+1], 2 * h - (x[1] + arr[i+1])) + w);
						break;
					case 1:
						sum += (x[1] + arr[i+1]);
						break;
					case 2:
						sum += (h - x[1] + arr[i+1]);
						break;
					}
					break;

				case 4: //동
					switch (arr[i]) {
					case 3:
						sum += (Math.min(x[1] + arr[i+1], 2 * h - (x[1] + arr[i+1])) + w);
						break;
					case 1:
						sum += (x[1] + w - arr[i+1]);
						break;
					case 2:
						sum += (h - x[1] + w - arr[i+1]);
						break;
					}
					break;
				}
			}

		}

		System.out.println(sum);

	}
}
