package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1697_숨바꼭질 {
	static class Pos {
		int value;
		int level;

		public Pos(int value, int level) {
			this.value = value;
			this.level = level;
		}
	}

	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		visited = new boolean[100001];

		Pos st = new Pos(N, 0);

		Queue<Pos> q = new LinkedList<>();

		q.add(st);
		int ans = 0;
		
		while (!q.isEmpty()&& N!=K) {
			Pos curr = q.poll();
			int minusOne = curr.value - 1;
			int plusOne = curr.value + 1;
			int mulTwo = curr.value * 2;

			if (minusOne == K || plusOne == K || mulTwo == K) {
				ans = curr.level + 1;
				break;
			} // K값 찾으면 브레잌

			if (!visited[minusOne] && minusOne >= 0) {
				q.add(new Pos(minusOne, curr.level + 1)); // X-1로 이동
				visited[minusOne] = true;
			}
			if (!visited[plusOne] && plusOne < 100001) {
				q.add(new Pos(plusOne, curr.level + 1)); // X+1로 이동
				visited[plusOne] = true;
			}
			if (!visited[mulTwo] && mulTwo < 100001) {
				q.add(new Pos(mulTwo, curr.level + 1)); // X*2로 이동
				visited[mulTwo] = true;
			}
		}

		System.out.println(ans);

	}
}
