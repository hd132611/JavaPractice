package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int pay = 1700000;
		int employee = 3;
		int chain = 1500;
		long cost = (long)pay * 12 * (long)employee * (long)chain;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d원", pay));
		System.out.println("점포 내 직원 수 : " + String.format("%,d명", employee));
		System.out.println("점포 수 : " + String.format("%,d개", chain));
		System.out.println();
		System.out.println("연간 인건비 : " + String.format("%,d원", cost));
		
		
	}

}
