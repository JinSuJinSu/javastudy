package prob02;

public class Book {
	
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	public void rent(int number) {
		if(this.bookNo==number) {
			this.stateCode = 0;
			System.out.println(this.title + "이(가) 대여됬습니다.");
		}
		
	}
	public void print() {
		String condition="재고 있음";
		if(stateCode==0) {
			condition="대여중";
		}
		System.out.println("책 제목:" + this.title + ", 작가:" + this.author + ", 대여 유무:" + condition);
	}
	
	
	
	

}
