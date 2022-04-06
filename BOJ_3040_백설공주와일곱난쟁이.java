package BOJ;
import java.util.Scanner;

public class BOJ_3040_백설공주와일곱난쟁이 {
	static int tot;
	static int[] dwarf;
	static int[] sel;
	static int[] res;
	static int n = 9;
	static int r = 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		dwarf = new int[n];
		tot = 0;
		for (int i = 0; i < n; i++) {
			dwarf[i] = sc.nextInt();
		}
		sel = new int[r];
		res = new int[r];
		int[] ans = new int[n - r];

		comb(0, 0);

		int k = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < r; j++) {
				if (dwarf[i] == res[j]) {
					flag = true;
				}
			}
			if (flag) {
				sb.append(dwarf[i]).append("\n");
			}
		}
		System.out.println(sb);
	}

	static void comb(int idx, int sidx) {

		if (sidx == r) {
			tot = 0;
			for (int i = 0; i < r; i++) {
				tot += sel[i];
			}
			if (tot == 100) {
				for (int i = 0; i < r; i++) {
					res[i] = sel[i];
				}
			}
			return;
		} else if (idx == n) {
			return;
		}
		sel[sidx] = dwarf[idx];
		comb(idx + 1, sidx + 1);
		comb(idx + 1, sidx);
	}
}
