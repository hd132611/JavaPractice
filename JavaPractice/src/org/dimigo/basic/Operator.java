package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		double trape = 0.5 * (9 + 10) * 5.8;
		double paral = (double)9 * 5.4;
		
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.printf("사다리꼴 넓이 : %.1f\n", trape);
		System.out.printf("평행사변형 넓이 : %.1f\n\n", paral);
		if(trape > paral){
			System.out.printf("사다리꼴이 평행사변형보다 %.1f 더 큽니다\n",trape-paral);
		}
		else if(trape < paral){
			System.out.printf("평행사변형이 사다리꼴보다 %.1f 더 큽니다\n",-(trape-paral));
		}
	}

}
