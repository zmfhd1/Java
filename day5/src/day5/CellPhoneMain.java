package day5;

class CellPhone{
	String model;	// 핸드폰 모델 번호
	double battery;	// 남은 배터리 양
	CellPhone(String model){
		this.model = model;
	}
	void  call(int time) {
		if(time < 0) {
			System.out.println("통화시간입력오류");
			return ;
		}
		System.out.println("통화 시간 : " +  time + "분");
		battery = battery  - time * 0.5;
		if(battery < 0) { battery = 0 ; }
	}//call end
	void  charge(int time)	{
		if(time < 0) {
			System.out.println("충전시간입력오류");
			return ;
		}
		System.out.println("충전 시간 : " +  time + "분");
		battery = battery + (time * 3);
		if(battery > 100) {battery = 100; }
	}//charge
	void  printBattery() {
		System.out.println("남은 배터리 양 : " + battery);
	}
	boolean isSame(CellPhone other) {
		return this.model.equalsIgnoreCase(other.model);
	}
}//CellPhone end

/*<<CellPhoneMain 실행결과>>
충전 시간 : 20분
남은 배터리 양 : 60.0
통화 시간 : 300분
남은 배터리 양 : 0.0
충전 시간 : 50분
남은 배터리 양 : 100.0
통화 시간 : 40분
남은 배터리 양 : 80.0
통화시간입력오류
동일 모델입니다. 

충전 시간 : 20분
남은 배터리 양 : 60.0
통화 시간 : 300분
남은 배터리 양 : 0.0
충전 시간 : 50분
남은 배터리 양 : 100.0
통화 시간 : 40분
남은 배터리 양 : 80.0
통화시간입력오류
다른 모델입니다.
*/

public class CellPhoneMain {
 
	public static void main(String[] args) { 
		CellPhone myPhone = new CellPhone("GALAXY-20");
		
		myPhone.charge( 20 );  //20분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.call( -20 );  //통화시간입력오류
		
		CellPhone yourPhone = new CellPhone("galaxy-20");
		
		if( myPhone.isSame(yourPhone) ) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		} 
	} 
}

/*
myPhone.isSame(yourPhone)  호출시 
boolean isSame(CellPhone other) {
	return this.model.equalsIgnoreCase(other.model);
} 실행되는데 이 때 other에 yourPhone 을 전달받아서 비교를 시작합니다
*/

