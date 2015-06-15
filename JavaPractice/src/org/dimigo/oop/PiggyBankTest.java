package org.dimigo.oop;

/*
 * <pre>
 * org.dimigo.oop
 * 		|_ PiggyBankTest
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * @author 신준섭
 *
 */
public class PiggyBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember[] fm = { new FamilyMember("아빠"),
										new FamilyMember("엄마"),
										new FamilyMember("나"),
										new FamilyMember("남동생")
		};
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(fm[0], 10000);
		PiggyBank.putMoney(fm[1], 5000);
		PiggyBank.putMoney(fm[2], 2000);
		PiggyBank.putMoney(fm[3], 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(fm[2], 1000);
		PiggyBank.printBalance();
	}

}
