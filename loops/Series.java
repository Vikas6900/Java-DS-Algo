// series sum    1 - 1/2 + 1/3 - 1/4 ---------- 1/n

package loops;

import java.util.Scanner;

public class Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		float result = 0;
		
		for(float i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				result -= 1/i;
			}else {
				result += 1/i;
			}
		}
		System.out.println(result);
	}

}
