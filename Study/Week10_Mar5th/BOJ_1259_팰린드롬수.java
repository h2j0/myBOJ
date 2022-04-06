package BOJ.Study.Week10_Mar5th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1259_팰린드롬수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String strNum = br.readLine();
			int len = strNum.length();
			int num = Integer.parseInt(strNum);
			if (num == 0)
				break;
			boolean flag = true;
			for (int i = 0; i < len / 2; i++) {
				if (strNum.charAt(i) != strNum.charAt(len - 1 - i)) {
					flag = false;
					break;
				}
			}
			sb.append(flag ? "yes" : "no").append("\n");
		}
		System.out.println(sb);
	}
}
