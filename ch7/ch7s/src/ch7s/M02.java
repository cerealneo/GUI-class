package ch7s;

import java.util.ArrayList;
import java.util.Scanner;

public class M02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> a = new ArrayList<String>();
		
	    System.out.print("��ĭ���� �и��Ͽ� 5 ���� ������ �Է�(A/B/C/D/F)>>");
		for(int i = 0; i<5; i++) {
			String s = sc.next();
		    a.add(s);
		
		switch (s) {

		case "A":
			System.out.print("4.0" + " ");
			break;

		case "B":
			System.out.print("3.0" + " ");
			break;

		case "C":
			System.out.print("2.0" + " ");
			break;

		case "D":
			System.out.print("1.0" + " ");
			break;

		case "F" :
			System.out.print("0.0" + " ");
			break;
		}
		
	}
		sc.close();
}
}