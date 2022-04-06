package BOJ;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_토마토 {

	static class Tomato {
		int r, c;

		public Tomato(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	static int N, M;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();

		int[][] box = new int[N][M];

		int empty = N * M;// box에 담을 수 있는 토마토의 총량

		Queue<Tomato> q = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				box[i][j] = sc.nextInt();
				// 입력으로는 0 or 1 or -1

//				if (box[i][j] != 0)
//					empty--;
//				if (box[i][j] == 1)
//					q.add(new Tomato(i, j));

				switch (box[i][j]) {
				case 1: // 토마토라면 넣기
					q.add(new Tomato(i, j));
				case -1: // 빈공간이라면 칸만 까, 토마토일때도 까
					--empty;
					break;
				}
			}
		}// 입력 완
		int days = 0;
		
		while(!q.isEmpty() && empty!=0) {
			
		}
	}

}
