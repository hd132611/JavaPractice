package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean ismale = false;
		int age = 23;
		double tall = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.printf("이름 : %s\n", name);
		if(ismale){	
			System.out.printf("성별 : %s\n","남자");
		}
		else{
			System.out.printf("성별 : %s\n","여자");
		}
		System.out.printf("나이 : %d세\n", age);
		System.out.printf("키 : %.1fcm\n", tall);
		System.out.printf("몸무게 : %.1fkg\n", weight);
		System.out.printf("혈액형 : %c형\n", bloodtype);

	}

}
