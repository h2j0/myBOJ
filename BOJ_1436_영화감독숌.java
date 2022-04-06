package BOJ;
import java.util.Scanner;

public class BOJ_1436_영화감독숌 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n / 19;
		int b = n % 19;

		String strNum = "";
		if (b == 0) {
			strNum = "9666";
		}
		
		else if (b < 7) {
			strNum = (b - 1) + "666";
		}
		
		else if (b < 17) {
			int x = b - 7;
			strNum = "666" + x;
		}
		
		else {
			strNum = (b - 10) + "666";
		}
		
		strNum = a + strNum;

		int num = Integer.parseInt(strNum);
		System.out.println(num);

	}
}
