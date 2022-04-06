package BOJ.done;
import java.util.Scanner;

public class BOJ_2839_설탕배달 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();
		
		// 먼저 5로 나눈 몫과 나머지를 구한다
		int fiveCnt = sugar / 5;
		int fiveRest = sugar % 5;
		int result;
		
		// 반복하는데 break되는 조건이 2개임
		// 1. 설탕이 두 수로 나눠지지 않을 때 (-1 출력)
		// 2. 값이 구해질 때 (5로 나눈 몫과 3으로 나눈 몫을 더한 값 출력)
		while (true) {
			int threeCnt = fiveRest / 3;			// 5로 나눈 나머지를 3으로 나눈다
			int threeRest = fiveRest % 3;
			if (fiveCnt == 0 && threeRest != 0) {	// 만약 5로 나눈 몫이 0이고 나머지가 3으로도 안나누어지
				result = -1;						// -1을 출력하면서 break
				break;
			} else {
				if (threeRest != 0) {				// 5로 나눈 몫이 0이 아니고 3으로 나누어지지 않으면 
					fiveCnt--;						// 몫을 하나 줄이고
					fiveRest += 5;					// 나머지를 5 더한다
				} else {
					result = fiveCnt + threeCnt;
					break;
				}
			}
		}
		System.out.println(result);
	}
}
