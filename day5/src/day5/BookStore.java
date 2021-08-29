package day5;


public class BookStore {
	public static void main(String[] args) {
		Book booklist[] = new Book[5]; 

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		BookMgr mgr = new BookMgr(booklist);
		System.out.println("=== 책 목록 ===");
		mgr.printBooklist();
		System.out.println("");
		System.out.println("=== 책 가격의 총합 ===");
		mgr.printTotalPrice();
	}
}

class Book{
	private String title;
	private int price;
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	Book(){
		
	}
	public void setTitle(String title){
		this.title = title;
	}// 제목 설정-수정
	public String getTitle() {
		return title;
	}// 제목 확인 조회
	public void setPrice(int price) {
		this.price = price;
	}//가격 설정 - 수정 
	public int getPrice() {
		return price;
	}// 가격 확인 조회
	
}//Book end

class BookMgr {
	Book [] booklist;
	BookMgr(Book[] booklist){//main 호출. 5개 Book  객체 저장 배열 전달 
		this.booklist = booklist;
	}
	void printBooklist() {
		for(int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	void printTotalPrice() {
		int sum = 0;
		for(int i = 0; i < booklist.length; i++) {
			sum = sum + booklist[i].getPrice();
			
		}
		System.out.println("전체 책 가격의 합 : " + sum);
	}
}//BookMgr end


/*
[실행결과]
=== 책 목록 ===
Java Program
JSP Program
SQL Fundamentals
JDBC Program
EJB Program

=== 책 가격의 총합 ===
전체 책 가격의 합 : 132000
*/