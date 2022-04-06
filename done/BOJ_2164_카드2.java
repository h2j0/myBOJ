package BOJ.done;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2164_카드2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력값
		// 큐 생성
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		// 카드가 2장일 때 하나 뽑아서 버리고 하나 뽑아서 뒤로 보내면 한장 남음
		while (q.size() >= 2) {
			q.remove();
			q.add(q.remove());
		}
		System.out.println(q.peek());
	}
}
