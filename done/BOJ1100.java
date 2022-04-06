package BOJ.done;
import java.util.Scanner;

public class BOJ1100 {
	public static void main(String[] args) {
		char[][] board = new char[8][8];
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		// 배열 만들기
		// 이중 배열 보드의 한 행씩 
		// 스트링을 char 한글자씩 배열로 만들어 넣어주는 toCharArray사용해서 넣어줌
		for (int i = 0; i < 8; i++) {
			board[i] = sc.next().toCharArray();
		}

		// 입력값이 F일 때 화이트보드판인지 확인해 cnt++
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j] == 'F') {
					if ((i % 2 == 0) && (j % 2 == 0)) {
						cnt++;
					} else if ((i % 2 == 1) && (j % 2 == 1)) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
