package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		double trape = 0.5 * (9 + 10) * 5.8;
		double paral = (double)9 * 5.4;
		
		
		System.out.println("<< ���� ���� �� >>");
		System.out.printf("��ٸ��� ���� : %.1f\n", trape);
		System.out.printf("����纯�� ���� : %.1f\n\n", paral);
		if(trape > paral){
			System.out.printf("��ٸ����� ����纯������ %.1f �� Ů�ϴ�\n",trape-paral);
		}
		else if(trape < paral){
			System.out.printf("����纯���� ��ٸ��ú��� %.1f �� Ů�ϴ�\n",-(trape-paral));
		}
	}

}
