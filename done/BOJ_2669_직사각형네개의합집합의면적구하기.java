package BOJ.done;
import java.util.Scanner;

public class BOJ_2669_직사각형네개의합집합의면적구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];
		int[][] point = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				point[i][j] = sc.nextInt();
			}
		} // 입력 완

		for (int i = 0; i < 4; i++) {
			for (int j = point[i][0]; j < point[i][2]; j++) {
				for (int k = point[i][1]; k < point[i][3]; k++) {
					arr[j][k] = 1;
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				cnt += arr[i][j] == 1 ? 1 : 0;
			}
		}
		System.out.println(cnt);
	}
}
