package ch6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q4 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		String s1 = Scanner.nextLine();
		
		StringTokenizer st = new StringTokenizer(s1, "+");
		
		int sum = 0;
		while(st.hasMoreTokens()) {
			String n = st.nextToken();
			String s = n.trim();
			sum += Integer.parseInt(s);
		}
		System.out.println("гую╨ " + sum);
	}
}