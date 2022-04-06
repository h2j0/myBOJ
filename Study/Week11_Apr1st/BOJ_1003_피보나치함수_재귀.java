package BOJ.Study.Week11_Apr1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1003_피보나치함수_재귀 {

	static int zero;
	static int one;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());
			zero = 0;
			one = 0;
			fibonacci(n);
			sb.append(zero).append(" ").append(one).append("\n");
		}
		System.out.println(sb);
	}// main

	private static int fibonacci(int n) {
		if (n == 0) {
			zero++;
			return 0;
		} else if (n == 1) {
			one++;
			return 1;
		} else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}// fibo
}
