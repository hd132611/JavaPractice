package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int pay = 1700000;
		int employee = 3;
		int chain = 1500;
		long cost = (long)pay * 12 * (long)employee * (long)chain;
		
		System.out.println("<< ��̺��� ���� �ΰǺ� >>");
		System.out.println("�� ��� �޿� : " + String.format("%,d��", pay));
		System.out.println("���� �� ���� �� : " + String.format("%,d��", employee));
		System.out.println("���� �� : " + String.format("%,d��", chain));
		System.out.println();
		System.out.println("���� �ΰǺ� : " + String.format("%,d��", cost));
		
		
	}

}
