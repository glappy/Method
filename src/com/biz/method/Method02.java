package com.biz.method;

public class Method02 {

	public static void main(String[] args) {
		// TODO main�� ���۵Ǵ� ��
		
		// TODO �簢�� �����
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("===============");

		// TODO ���ﰢ�� �������
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = j; i < 5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("===============");
		
		// TODO ���� for�� ����� ��
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(i);
		}
		System.out.println();
		for(int i = 1 ; i < 5 ; i++) {
			System.out.print(i);
		}
		System.out.println();
		for(int i = 2 ; i < 5 ; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("===============");
		
		// JAVA DOC�� ���� �ּ����� keyword
		// �ϸ�ũ ������ �ϴ� �ּ�
		// TODO ���ﰢ�� �����
		for(int j = 0; j < 5 ; j++) {
			for(int i = j ; i < 5 ; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("===============");
		
		// TODO �ﰢ�� �����
		for(int j=0;j<5;j++) {
			for(int i = 0 ; i < j ; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
