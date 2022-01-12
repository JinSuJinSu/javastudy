package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		System.out.print("숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		int result=0;
		if(number%2==0) {
			for(int i=2; i<=number; i+=2) {
				result+=i;
			}
		}
		else {
			for(int i=1; i<=number; i+=2) {
				result+=i;
			}
		}
		System.out.println("결과값 : " + result);
		
		scanner.close();
	}
}
