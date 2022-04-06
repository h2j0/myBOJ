package BOJ.done;
import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10828_스택 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 조건문에서 바로바로 println을 이용해서 출력하면 시간초과 일어난다
		// 이를 해결하기 위해 StringBuilder에 출력값을 저장해서 마지막에 출력한다
		StringBuilder sb = new StringBuilder();

		ArrayList<Integer> stack = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			int len = stack.size();
			switch (sc.next()) {
			// push가 입력되면 그 다음에 들어오는 숫자를 stack에 넣어준다
			case "push":
				int pushNum = sc.nextInt();
				stack.add(pushNum);
				break;

			// pop이 입력되면
			// stack의 길이가 0일 때 -1
			// 0이 아닐 때 stack의 마지막값을 꺼내고 stack의 마지막값 제거한다
			case "pop":
				if (len == 0) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.get(len - 1)).append("\n");
					stack.remove(len - 1);
				}
				break;
			
			case "size":
				sb.append(stack.size()).append("\n");
				break;

			case "empty":
				sb.append(len == 0 ? 1 : 0).append("\n");
				break;

			case "top":
				sb.append(len == 0 ? -1 : stack.get(len - 1)).append("\n");
				break;
			}

		}
		System.out.println(sb);
	}

}