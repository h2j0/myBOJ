package BOJ.done;
import java.util.Scanner;

public class BOJ_2292_벌집 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		
		while (n > 1) {		// 1이상일 때만 반복문이 돌아야 한다
			n -= 6 * i++;	// 숫자가 해당되는 라인을 찾기위해 6의 배수만큼 빼준다 
		}
		System.out.println(i);
	}
}
