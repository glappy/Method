package com.biz.method;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triAngle(5); // ���� 5��¥��
		triAngle(7); // ���� 7��¥��
		triAngle(10); // ���� 10��¥��
		

	} // end main
	
	// method�� �����ϸ鼭 ()�ȿ� ���� ������ �θ�
	// �� method�� ���(ȣ��,call, ����)�Ҷ�
	// method(��) ���·� �ڵ带 �ۼ��Ѵ�.
	// ���� void method(int a) ���¶�� �ϸ�
	// ����Ҷ��� method(3) �̶�� �ۼ��ϸ�
	// �ڹٴ� method(int a = 3) �̶�� ��������
	// �ٽ� ������ �Ѵ�.
	// ��ġ method ���ο��� int a = 3�̶��
	// ������ ����, �����ѰͰ� ����.
	
	// �̶� method()���� ����� ������
	// ȣ���ϴ� ������ ������ ���� method�� �����ϴ�
	// �Ű�ü ������ �Ѵ�.
	// �� ������ �Ű�������� �θ���.
	public static void triAngle(int intStarCount) {
		
//		 int intStarCount = 5;
		
		for (int j = 0; j < intStarCount; j++) {
			// ��ĭ�� � ���
			for (int i = j; i < intStarCount; i++) {
				System.out.print(" ");
			}

			// ���� �κп� ���� ����
			for (int k = 0; k < j; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	} // end triAngle

}