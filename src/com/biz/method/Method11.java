package com.biz.method;

public class Method11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 50;
		int intNum2 = 30;
		// addVar�� ȣ��, �����Ҷ�
		// �����ϴ� ���� intNum1, intNum2��
		// ������ ���޵Ǵ� ���� �ƴϰ�
		// ������ ����Ǿ� �ִ� �� 
		// 50�� 30�� ���޵ȴ�
		addVar(intNum1, intNum2);
	}
	public static void addVar(int intNum1, 
					int intNum2) {

		System.out.printf("%d + %d = %d",
				intNum1, 
				intNum2, 
				intNum1+intNum2);
	}
}