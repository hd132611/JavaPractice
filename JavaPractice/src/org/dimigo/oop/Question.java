package org.dimigo.oop;

import java.util.Scanner;

/*
 * <pre>
 * org.dimigo.oop
 * 		|_ Question
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 * @author 신준섭
 *
 */
public class Question {

	public static void main(String[] args) {
		String que1 = "잠";
		String que2 = "김정욱";
		String que3 = "하미영쌤";
		Scanner scanner = new Scanner(System.in);
		System.out.println("가장 하고싶은 일은??");
		String answer = scanner.nextLine();
		if(que1.equals(answer)){
			System.out.println("정답입니다");
		}
		else{
			System.out.println("틀렸어?");
		}
		
		System.out.println("우리반의 스투충은??");
		String answer2 = scanner.nextLine();
		if(que2.equals(answer2)){
			System.out.println("정답입니다");
		}
		else{
			System.out.println("틀렸어?");
		}
		
		System.out.println("자바를 가르치시는 선생님은??");
		String answer3 = scanner.nextLine();
		if(que3.equals(answer3)){
			System.out.println("정답입니다");
		}
		else{
			System.out.println("틀렸어?");
		}
		
	}

}
