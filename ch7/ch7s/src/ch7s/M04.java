package ch7s;

import java.util.Scanner;
import java.util.Vector;

public class M04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("2000 ~ 2009�� ���� 1������� Ű(cm)�� �Է�");
		System.out.print(">>");

		for(int i = 0; i < 10; i++) {
			v.add(sc.nextInt());
		}
		
		int max = v.get(1) - v.get(0);
		int year = 0;
		for(int i=0;i<9;i++){
			int x = v.get(i+1) - v.get(i);
			if(max<x){
				max = x;
				year = 2000 +i;
			}
		}	
		System.out.println("���� Ű�� ���� �ڶ� �⵵�� " + year + "�� " + (float)max +"cm");
		
		sc.close();
	}
}