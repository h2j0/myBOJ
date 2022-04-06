package BOJ.done;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2578_빙고 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner("11 12 2 24 10\r\n" + "16 1 13 3 25\r\n" + "6 20 5 21 17\r\n" + "19 4 8 14 9\r\n"
//				+ "22 15 7 23 18\r\n" + "5 10 7 16 2\r\n" + "4 22 8 17 13\r\n" + "3 18 1 6 25\r\n"
//				+ "12 19 23 14 21\r\n" + "11 24 9 20 15");
		int[][] board = new int[5][5]; // 조회하는데 범위 체크 안하려고 크게 만들어
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int[] callNum = new int[25];
		for (int i = 0; i < 25; i++) {
			callNum[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(callNum));
		// 사회자가 부르는 숫자를 체크할건데, 그리고 해당 숫자는 0으로 바꿀거야
		// 근데 최소 12개는 체크해야 빙고가 나오니까 일단 12개 숫자를 0으로 바꾸자

		for (int idx = 0; idx < 11; idx++) { // callNum 하나씩
			for (int r = 0; r < 5; r++) {
				for (int c = 0; c < 5; c++) {
					if (board[r][c] == callNum[idx]) {
						board[r][c] = 0;
					}
				}
			}
		}
//		for (int r = 0; r < 5; r++) {
//			for (int c = 0; c < 5; c++) {
//				System.out.print(board[r][c]+" ");
//			}System.out.println();}
		// 이제부터 빙고 체크하고 값 받으면서 숫자 0으로
		int bingo = 0;
		int idx = 11;
		while (bingo < 3) {
			bingo = 0;

			outer: for (int r = 0; r < 5; r++) {
				for (int c = 0; c < 5; c++) {
					if (board[r][c] == callNum[idx]) {
						board[r][c] = 0;
						break outer;
					}
				}
			}
			idx++;
			
			// 좌상우하 대각선 체크
			int cnt = 0;
			for (int i = 0; i < 5; i++) {
				if (board[i][i] == 0) {
					cnt++;
				} else
					break;
			}
			if (cnt == 5) {
				bingo++;
			}

			// 우상좌하 대각선 체크
			cnt = 0;
			for (int i = 0; i < 5; i++) {
				if (board[i][4 - i] == 0) {
					cnt++;
				} else
					break;
			}
			if (cnt == 5) {
				bingo++;
			}

			// 가로 체크
			for (int i = 0; i < 5; i++) {
				cnt = 0;
				for (int j = 0; j < 5; j++) {
					if (board[i][j] == 0) {
						cnt++;
					} else
						break;
				}
				if (cnt == 5) {
					bingo++;
				}
			}

			// 세로 체크
			for (int i = 0; i < 5; i++) {
				cnt = 0;
				for (int j = 0; j < 5; j++) {
					if (board[j][i] == 0) {
						cnt++;
					} else
						break;
				}
				if (cnt == 5) {
					bingo++;
				}
			}

		}
		System.out.println(idx);
	}
}
