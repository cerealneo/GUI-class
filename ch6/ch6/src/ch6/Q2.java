package ch6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		while(true) {
			String s = Scanner.nextLine();
			if(s.equals("exit")) {
				System.out.println("�����մϴ�..");
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");
			
			int n = st.countTokens();
			System.out.println("���� ������ " + n);
		}
	}
}