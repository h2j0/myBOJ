package BOJ.done;
import java.util.Scanner;

public class BOJ_9012_괄호 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {

			// 괄호 입력받음
			char[] temp = sc.next().toCharArray();
			int check = 0;
			String res = "";
			
			// (의 개수와 )의 개수가 일치하면 YES이니까
			// 반복문을 돌면서 ( -> 1로 만들고 ) -> -1로 만들기
			for (int i = 0; i < temp.length; i++) {
				check += (temp[i] == '(' ? 1 : -1);
				if (check < 0) {	// 닫힘이 열림보다 먼저 나오면 체크는 음수가 된다 
					break;			// 그 때 반복문을 빠져 나온다
					
				}
			}
			res = check == 0 ? "YES" : "NO";
			System.out.println(res);
		}
	}

}
