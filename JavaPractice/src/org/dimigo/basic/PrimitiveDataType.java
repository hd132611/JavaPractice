package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "������";
		boolean ismale = false;
		int age = 23;
		double tall = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("<<������ ������>>");
		System.out.printf("�̸� : %s\n", name);
		if(ismale){	
			System.out.printf("���� : %s\n","����");
		}
		else{
			System.out.printf("���� : %s\n","����");
		}
		System.out.printf("���� : %d��\n", age);
		System.out.printf("Ű : %.1fcm\n", tall);
		System.out.printf("������ : %.1fkg\n", weight);
		System.out.printf("������ : %c��\n", bloodtype);

	}

}
