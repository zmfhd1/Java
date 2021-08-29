package day5;

class CellPhone{
	String model;	// �ڵ��� �� ��ȣ
	double battery;	// ���� ���͸� ��
	CellPhone(String model){
		this.model = model;
	}
	void  call(int time) {
		if(time < 0) {
			System.out.println("��ȭ�ð��Է¿���");
			return ;
		}
		System.out.println("��ȭ �ð� : " +  time + "��");
		battery = battery  - time * 0.5;
		if(battery < 0) { battery = 0 ; }
	}//call end
	void  charge(int time)	{
		if(time < 0) {
			System.out.println("�����ð��Է¿���");
			return ;
		}
		System.out.println("���� �ð� : " +  time + "��");
		battery = battery + (time * 3);
		if(battery > 100) {battery = 100; }
	}//charge
	void  printBattery() {
		System.out.println("���� ���͸� �� : " + battery);
	}
	boolean isSame(CellPhone other) {
		return this.model.equalsIgnoreCase(other.model);
	}
}//CellPhone end

/*<<CellPhoneMain ������>>
���� �ð� : 20��
���� ���͸� �� : 60.0
��ȭ �ð� : 300��
���� ���͸� �� : 0.0
���� �ð� : 50��
���� ���͸� �� : 100.0
��ȭ �ð� : 40��
���� ���͸� �� : 80.0
��ȭ�ð��Է¿���
���� ���Դϴ�. 

���� �ð� : 20��
���� ���͸� �� : 60.0
��ȭ �ð� : 300��
���� ���͸� �� : 0.0
���� �ð� : 50��
���� ���͸� �� : 100.0
��ȭ �ð� : 40��
���� ���͸� �� : 80.0
��ȭ�ð��Է¿���
�ٸ� ���Դϴ�.
*/

public class CellPhoneMain {
 
	public static void main(String[] args) { 
		CellPhone myPhone = new CellPhone("GALAXY-20");
		
		myPhone.charge( 20 );  //20�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( -20 );  //��ȭ�ð��Է¿���
		
		CellPhone yourPhone = new CellPhone("galaxy-20");
		
		if( myPhone.isSame(yourPhone) ) {
			System.out.println("���� ���Դϴ�.");
		} else {
			System.out.println("�ٸ� ���Դϴ�.");
		} 
	} 
}

/*
myPhone.isSame(yourPhone)  ȣ��� 
boolean isSame(CellPhone other) {
	return this.model.equalsIgnoreCase(other.model);
} ����Ǵµ� �� �� other�� yourPhone �� ���޹޾Ƽ� �񱳸� �����մϴ�
*/

