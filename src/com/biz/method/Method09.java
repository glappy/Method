package com.biz.method;

public class Method09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addVar();
		addVar(30);
		addVar(30,60);
		/*
		 * �޼��带 ����ϴ� ����� ����
		 * ������ �����ϹǷ� �ؼ�
		 * �Է��ϴ� �����
		 * �����͸� �Է��ϴ� �Ǽ��� �ּ�������
		 * �Ҽ� �ִ� ���� �ڵ� �ۼ���
		 */
	}

	public static void addVar() {
		System.out.println("���ڸ� �������� ������");
		System.out.println("����� �Ҽ� �����ϴ�");
	}
	
	public static void addVar(int intNum) {
		System.out.println("���� 2���� �����ؾ� �մϴ�");
	}
	
	public static void addVar(int intNum1, int intNum2) {
		System.out.print("�ΰ��� ����");
		System.out.print(intNum1);
		System.out.print(" ��(��) ");
		System.out.print(intNum2);
		System.out.print("�� ���ϸ�");
		System.out.print(intNum1 + intNum2);
		System.out.println(" �� �ȴ�.");
	}

}
