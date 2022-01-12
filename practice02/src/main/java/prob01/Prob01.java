package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		/* 코드 작성 */
		int number = scanner.nextInt();
		for(int money : MONEYS) {
			int cnt = number/money;
			number-=(money*cnt);
			System.out.println(money + "원 : " + cnt + "개");
		}
		
		scanner.close();
 	}
}