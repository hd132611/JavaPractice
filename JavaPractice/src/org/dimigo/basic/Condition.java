package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 25;
		String cartype = "��ӹ���";
		double pay;

		System.out.println("<< ��ӵ��� ����� ��� >>");
		//����
		switch(cartype){
		case "����":
			System.out.printf("�Ÿ� : %dkm\n", distance);
			System.out.println("���� : ����");
			if(distance>10)
			System.out.printf("����� : %d��\n", 300 + (distance/10) * 200);
			else System.out.printf("����� : %d��\n", 300);
			break;
		case "��ӹ���":
			System.out.printf("�Ÿ� : %dkm\n", distance);
			System.out.println("���� : ��ӹ���");
			if(distance>10)
			System.out.printf("����� : %d��\n", 850 + (distance/10) * 300);
			else System.out.printf("����� : %d��\n", 850);
			break;
		default:
			System.out.printf("�Ÿ� : %dkm\n", distance);
			System.out.println("���� : �� ��");
			if(distance>10)
			System.out.printf("����� : %d��\n", 600 + (distance/10) * 200);
			else System.out.printf("����� : %d��\n", 600);
			break;
		}
		//�����
		
		
	}

}
