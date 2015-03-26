package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 25;
		String cartype = "고속버스";
		double pay;

		System.out.println("<< 고속도로 통행료 계산 >>");
		//차종
		switch(cartype){
		case "경차":
			System.out.printf("거리 : %dkm\n", distance);
			System.out.println("차종 : 경차");
			if(distance>10)
			System.out.printf("통행료 : %d원\n", 300 + (distance/10) * 200);
			else System.out.printf("통행료 : %d원\n", 300);
			break;
		case "고속버스":
			System.out.printf("거리 : %dkm\n", distance);
			System.out.println("차종 : 고속버스");
			if(distance>10)
			System.out.printf("통행료 : %d원\n", 850 + (distance/10) * 300);
			else System.out.printf("통행료 : %d원\n", 850);
			break;
		default:
			System.out.printf("거리 : %dkm\n", distance);
			System.out.println("차종 : 그 외");
			if(distance>10)
			System.out.printf("통행료 : %d원\n", 600 + (distance/10) * 200);
			else System.out.printf("통행료 : %d원\n", 600);
			break;
		}
		//통행료
		
		
	}

}
