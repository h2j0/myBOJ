package BOJ;

import java.util.Scanner;

public class BOJ_1676_팩토리얼0의개수_외않되 {
	static int nfact;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nfact = 1;
		int cnt = 0;
		if (n != 0) {
			// 팩토리얼한 결과
			long factRes = fact(n);
			// 스트링으로 만들어주고
			String strNum = "" + factRes;
			// 뒤에서부터 0개수 세자
			for (int i = strNum.length() - 1; i >= 0; i--) {
				if (strNum.charAt(i) == '0')
					cnt++;
				else
					break;
			}
		}
		System.out.println(cnt);
	}

	private static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		nfact = n * fact(n - 1);
		return nfact;
	}
}
