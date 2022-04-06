package BOJ.done;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2578_빙고2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner("11 12 2 24 10\r\n" + "16 1 13 3 25\r\n" + "6 20 5 21 17\r\n" + "19 4 8 14 9\r\n"
				+ "22 15 7 23 18\r\n" + "5 10 7 16 2\r\n" + "4 22 8 17 13\r\n" + "3 18 1 6 25\r\n"
				+ "12 19 23 14 21\r\n" + "11 24 9 20 15");
		int[][] board = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int[] callNum = new int[25];
		for (int i = 0; i < callNum.length; i++) {
			callNum[i] = sc.nextInt();
		}
		int k = 0;
		for (k = 0; k < 11; k++) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (board[i][j] == callNum[k]) {
						board[i][j] = 0;
					}
				}
			}
		}
		int bingo = 0;
		while (bingo < 3) {
			bingo = 0;
			int num = callNum[k];
			++k;
			System.out.println(num);
			// 부르는 숫자 0으로 바꾸기
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (board[i][j] == num)
						board[i][j] = 0;
				}
			}

			// 가로
			int cnt = 0;
			for (int i = 0; i < 5; i++) {
				cnt = 0;
				for (int j = 0; j < 5; j++) {
					if (board[i][j] != 0) {
						break;
					} else
						cnt++;
				}
				if (cnt == 5) {
					bingo++;
				}
			}
			System.out.println("가로 : " + bingo);
			// 세로
			for (int i = 0; i < 5; i++) {
				cnt = 0;
				for (int j = 0; j < 5; j++) {
					if (board[j][i] != 0) {
						break;
					} else
						cnt++;
				}
				if (cnt == 5) {
					bingo++;
				}
			}
			System.out.println("세로 : " + bingo);

			// 대각선 좌상우하
			cnt = 0;
			for (int i = 0; i < 5; i++) {
				if (board[i][i] != 0) {
					cnt = 0;
					break;
				} else
					cnt++;
			}
			if (cnt == 5) {
				bingo++;
			}
			System.out.println("대각선 좌상우하 : " + bingo);
			// 대각선 우상좌하
			cnt = 0;
			for (int i = 0; i < 5; i++) {
				if (board[i][4 - i] != 0) {
					cnt = 0;
					break;
				} else
					cnt++;
			}
			if (cnt == 5) {
				bingo++;
			}
			System.out.println("대각선 우상좌하 : " + bingo);
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println(k);
	}
}
