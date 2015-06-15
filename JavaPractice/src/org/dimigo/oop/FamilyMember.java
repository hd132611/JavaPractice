package org.dimigo.oop;

/*
 * <pre>
 * org.dimigo.oop
 * 		|_ FamilyMember
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * @author 신준섭
 *
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName) {
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원수 : " + memberCnt);
	}
}
