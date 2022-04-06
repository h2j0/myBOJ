package BOJ.done;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_2635_수이어가기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> ans = new LinkedList<>();

		int maxSize = 0;
		int n1 = 0;
		int n2 = 0;
		int addNum = 0;
		for (int i = n; i >= n / 2; i--) {
			LinkedList<Integer> list = new LinkedList<>();
			list.add(n);
			list.add(i);
			while (true) {
				n1 = list.get(list.size() - 2); // 앞 숫자
				n2 = list.get(list.size() - 1); // 뒷 숫자
				addNum = n1 - n2;
				if (addNum < 0) {
					break;
				}
				list.add(addNum);
			}
			if (maxSize < list.size()) {
				maxSize = list.size();
				ans = list;
			}
		}

		System.out.println(maxSize);
		for(int i=0;i<ans.size();i++) {			
			System.out.print(ans.get(i)+" ");
		}

	}
}