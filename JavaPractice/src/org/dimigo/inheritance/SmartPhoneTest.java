package org.dimigo.inheritance;

/*
 * <pre>
 * org.dimigo.inheritance
 * 		|_ SmartPhoneTest
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * @author 신준섭
 *
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone[] phones = {
				new IPhone("아이폰 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000),
			};
			for(SmartPhone phone : phones){
				System.out.println(phone);
				phone.turnOn();
				phone.pay();
				
				//IPhone 또는 Galaxy폰 기능 사용하기
				phone.useSpecialFunction();
				
				phone.turnOff();
				System.out.println();
				
			}
	}

}
