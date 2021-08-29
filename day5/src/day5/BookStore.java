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
		System.out.println("=== å ��� ===");
		mgr.printBooklist();
		System.out.println("");
		System.out.println("=== å ������ ���� ===");
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
	}// ���� ����-����
	public String getTitle() {
		return title;
	}// ���� Ȯ�� ��ȸ
	public void setPrice(int price) {
		this.price = price;
	}//���� ���� - ���� 
	public int getPrice() {
		return price;
	}// ���� Ȯ�� ��ȸ
	
}//Book end

class BookMgr {
	Book [] booklist;
	BookMgr(Book[] booklist){//main ȣ��. 5�� Book  ��ü ���� �迭 ���� 
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
		System.out.println("��ü å ������ �� : " + sum);
	}
}//BookMgr end


/*
[������]
=== å ��� ===
Java Program
JSP Program
SQL Fundamentals
JDBC Program
EJB Program

=== å ������ ���� ===
��ü å ������ �� : 132000
*/