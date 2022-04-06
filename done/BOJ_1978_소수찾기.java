package BOJ.done;
import java.util.Scanner;

public class BOJ_1978_소수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// n: 입력값의 개수
		int n = sc.nextInt();
		boolean flag;
		int cnt = 0;
		
		// 입력값 개수만큼 반복
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			// 초기값 true
			flag = true;
			// 입력 숫자가 1인 경우에는 cnt 안하니까 1을 기준으로 case를 나눈다
			if (num > 1) {	// 1보다 클 때 자기 자신보다 작은 숫자로 나눠지는 수가 있다면 false
				for (int j = 2; j < num; j++) {
					if (num % j == 0) {
						flag = false;
						break;
					}
				}
			} else	// 입력값이 1일 때 false
				flag = false;
			
			// true일 때 1을 더해준다
			cnt += flag ? 1 : 0;

		}
		System.out.println(cnt);
	}

}
