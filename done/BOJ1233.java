package BOJ.done;
import java.util.Scanner;

public class BOJ1233 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// 배열의 인덱스는 0부터 시작이니까 배열사이즈는 +1 만들어줌
		int[] numArr = new int[a + b + c + 1];
		// 배열 인덱스 번호가 세 주사위의 합
		// 배열의 값이 빈도 나온 횟수
		// 주사위는 1부터 입력받은 숫자까지니까 반복문의 횟수를 다음과 같이 설정
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				for (int k = 1; k <= c; k++) {
					numArr[i + j + k]++;
				}
			}
		}
		// 최대 빈도값
		int max = 0;
		for (int i : numArr) {
			max = Math.max(max, i);
		}
		// 그 빈도값일 때 주사위의 합(idx) 구하기 
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] == max) {
				System.out.println(i);
				break; // 가장 작은 합만 구하면 되니까 찾으면 반복문 나온다
			}
		}
	}
}