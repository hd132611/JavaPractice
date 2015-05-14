package org.dimigo.oop;

import java.util.Scanner;

/*
 * <pre>
 * org.dimigo.oop
 * 		|_ Score
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 * @author 신준섭
 *
 */
public class Score {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		
		System.out.println("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		int sum = kor + mat + eng;

		System.out.println();
		StringBuilder sb = new StringBuilder();
		sb.append("<<점수출력>>\n");
		sb.append("국어점수 : ");
		sb.append(kor);
		sb.append(" 점\n수학점수 : ");
		sb.append(mat);
		sb.append(" 점\n영어점수 : ");
		sb.append(eng);
		sb.append(" 점\n총점 : ");
		sb.append(sum);
		sb.append(" 점\n평균 : ");
		sb.append(String.format("%.1f점", (double)sum/3));
		System.out.println(sb.toString());
	}

}
