package org.dimigo.oop;

/*
 * <pre>
 * org.dimigo.oop
 * 		|_ CarTest
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 4. 13.
 * </pre>
 * @author ���ؼ�
 *
 */
public class CarTest {

	public static void main(String[] args) {
		Car3 hyun = new Car3("�����ڵ���", "���׽ý�", "������", 225, 50000000);
		Car3 kia = new Car3("����ڵ���", "K7", "���", 246);
		Car3 sam = new Car3("�Ｚ�ڵ���", "SM7", "ȸ��");
//		hyun.setCompany("�����ڵ���");
//		hyun.setModel("���׽ý�");
//		hyun.setColor("������");
//		hyun.setMaxSpeed(225);
//		hyun.setPrice(50000000);
//		
//		kia.setCompany("����ڵ���");
//		kia.setModel("K7");
//		kia.setColor("���");
//		kia.setMaxSpeed(246);
//		kia.setPrice(40000000);
//		
//		sam.setCompany("�Ｚ�ڵ���");
//		sam.setModel("SM7");
//		sam.setColor("ȸ��");
//		sam.setMaxSpeed(200);
//		sam.setPrice(38000000);
		
		System.out.println(" << �ڵ������ >> ");
		System.out.println("������� : " + hyun.getCompany());
		System.out.println("�𵨸� : " + hyun.getModel());
		System.out.println("���� : " + hyun.getColor());
		System.out.println("�ִ�ӵ� : " + hyun.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", hyun.getPrice()) + "��");
		System.out.println();
		System.out.println("������� : " + kia.getCompany());
		System.out.println("�𵨸� : " + kia.getModel());
		System.out.println("���� : " + kia.getColor());
		System.out.println("�ִ�ӵ� : " + kia.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", kia.getPrice()) + "��");
		System.out.println();
		System.out.println("������� : " + sam.getCompany());
		System.out.println("�𵨸� : " + sam.getModel());
		System.out.println("���� : " + sam.getColor());
		System.out.println("�ִ�ӵ� : " + sam.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", sam.getPrice()) + "��");
	}

}
