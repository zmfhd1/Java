package day3;

public class ArrayTest1 {
// 1���� �迭. �̸�, ���� 1�� ���� �迭
	public static void main(String[] args) {
		// 5�� �л��̸� ���� �迭
		// ���� ���� ���� �迭
		// ���ڹ� : 95
		// �迭 ���� + ���� + �ʱ�ȭ�� 1��������
		// names.length , scores.length
		String names [] = {"����ȣ", "�ڿ���", "�����", "���ڹ�", "������"}; //new String [5];
		//���� �ٸ��͵� �������� �ʾƵ� ��
		//�迭 ���� + ����
		int scores [] = new int[names.length];
		//�迭 �ʱ�ȭ
		for(int i = 0 ; i <= names.length ; i++) {
		scores[i] = (int)(Math.random() * 100) + 1;
		}
		//���
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(names[i] + " : " + scores[i] );
		}
		//1�� : �̸� : ����
		/*����ȣ : 68
�ڿ��� : 88
����� : 86
���ڹ� : 29
������ : 53
*/
		int max = 0 ; // score �迭 �ִ밪 ���� ����
		int maxIndex = 0;
		for(int i = 0 ; i < names.length ; i++) {
			if(max < scores[i]) {
				max = scores[i];
				maxIndex = i;
			}
		}
		System.out.println("1�� : " + names[maxIndex] + " : " + scores[maxIndex]);
		// max = o scores[0] �� ==> max = 18 [18,29,88,66,77]
		// max = 18 scores[1] �� ==> max = 29
// max = 29 scores[2] �� ==> max = 88
		// max = 88 scores[3] �� ==> �ƹ� �ϵ� ���Ѵ�
		// max = 88 scores[4] �� ==> �ƹ� �ϵ� ���Ѵ�
		// ��ü ��� ���غ���
		
		//Ŭ���� ����� ����ȣ �Է��ϸ� scores �迭���� ����ȣ ���� ���
		//Ŭ���� ����� ����ȣ �Է��ϸ� �ش� �л��� �������� �ʽ��ϴ�. ���
		
		//args[0] - names �迭 5�� �̸� �� ������ �� ã���� �ε��� ��� - �����迭[�ε���]
		//{"����ȣ", "�ڿ���", "�����", "���ڹ�", "������"};
		
		boolean result = false;
		for(int i = 0 ; i < names.length ; i++) {
			if(args[0].equals(names[i])) { // [0]�� [i]�� ���ڿ��̱� ������ == ���� �ּҰ��� ���ϰ� ��
			System.out.println(scores[i]);
			result = true;
			break;
			}
		}//for end
		
		if(result == false ) {
			System.out.println("�ش� �л��� �������� �ʽ��ϴ�");
		}
		
		for(int i = 0 ; i < names.length ; i++) {
			System.out.println(names[i]);
		}//for end
		
		//jdk 1.5 ���� �߰� ���� = ���� for
		for( String one : names/*�ݺ���� �� �� �Է�*/) {
			System.out.println(one);
	}	
}
}

