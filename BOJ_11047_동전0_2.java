package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_11047_동전0_2 {
	static int[] coin;
	static int minCnt;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		coin = new int[N];
		for (int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		// 리버스 해주려면 Integer[]로 해줘야 함.....
//		Integer[] coin = new Integer[N];
//		Arrays.sort(coin, Collections.reverseOrder());
		Arrays.sort(coin);

//		System.out.println(Arrays.toString(coin));
		minCnt = K;
		for (int i = N - 1; i >= 0; i--) {
			findCnt(0, i, K);
		}
		System.out.println(minCnt);
	}// main

	private static void findCnt(int cnt, int idx, int target) {
		if (coin[idx] > target) {
			return;
		}
		while (idx >= 0) {
			if (cnt > minCnt || target == 0)
				break;
			cnt += target / coin[idx];
			target = target % coin[idx];
			idx--;
		}
		if (minCnt > cnt) {
			minCnt = cnt;
		}
		return;
	}
}
