package day5;

//Parent p2 = new Child()
//p2.pr()
//�ʵ庯���� non-overriding�޼ҵ� - Parent ���� 
//overriding�޼ҵ� - "�켱" - Child ���� 
class Parent{
	int su = 10;
	void pr() {
		System.out.println(su);
	}
	void getParent() {
		System.out.println("ParentŬ����");
	}
}

class Child extends Parent{
	int su = 20;
	void pr() {
		System.out.println(su);
	}
	void getChild() {
		System.out.println("ChildŬ����");
	}
}

public class CastingTest {
public static void main(String[] args) {
		Parent p1 = new Parent();//����ȯ�ʿ�x
		System.out.println(p1.su);
		p1.getParent();//Parent����
		//p1.getChild();//�޸𸮻���x
		
		Child c1 = new Child();//����ȯ�ʿ�x
		System.out.println(c1.su);
		c1.getParent();
		c1.getChild();//o
		
		Parent p2 = new Child();//�ڵ�����ȯ
		System.out.println(p2.su);//Parent����
		System.out.println( ((Child)p2).su);//Child����	- 20
		p2.getParent();
		((Child)p2).getChild();//�޸𸮻���o. p2���� ��� ���� 
		
		/*Child c2 = (Child)p2;//���������ȯ
		System.out.println(c2.su);//Child����-20
		c2.getParent();
		c2.getChild();*/
		

}
}



