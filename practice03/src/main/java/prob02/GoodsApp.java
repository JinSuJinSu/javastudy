package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i=0; i<goods.length; i++) {
			System.out.print("상품명 : ");
			String product = scanner.next();
			System.out.print("가격 : ");
			int price = scanner.nextInt();
			System.out.print("수량 : ");
			int cnt = scanner.nextInt();
			goods[i] = new Goods(product,price,cnt);
		}
		// 상품 출
		for(Goods good : goods) {
			System.out.println(good.getProduct() + "(가격:" + good.getPrice() + "원)이 " + good.getCnt() + "개 입고 되었습니다.");
		}
		
		// 자원정리
		scanner.close();
	}
}
