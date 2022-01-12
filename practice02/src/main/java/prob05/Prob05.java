package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		Random random = new Random();
		int correctNumber = random.nextInt( 100 ) + 1;
		System.out.println("수를 결정하셨습니다. 맞추어 보세요");
		int startNum=1;
		
		while(true) {
			System.out.println("1-100");
			System.out.print(startNum + ">>");
			int myNum = scanner.nextInt();
			if(myNum>correctNumber) {
				System.out.println("더 낮게");
			}
			else if(myNum<correctNumber){
				System.out.println("더 높게");
			
			}
			else {
				System.out.println("맞았습니다.");
				System.out.println("다시하시겠습니까(y/n)>>");
				String condition = scanner.next();
				if(condition.equals("y")) {
					startNum=1;
					correctNumber = random.nextInt(100) + 1;
					System.out.println("수를 결정하셨습니다. 맞추어 보세요");
				}
				else if(condition.equals("n")) {
					System.out.println("게임 종료합니다.");
					break;
				}
				else {
					System.out.println("게임 종료합니다.");
					break;
				}
			}
			startNum+=1;
	}
		scanner.close();
	}
}

	