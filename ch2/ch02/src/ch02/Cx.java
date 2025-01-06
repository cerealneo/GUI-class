package ch02;

import java.util.Scanner;

public class Cx {
		public Cx() {}
		public void run() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("x 값을 입력하세요>>");
			int x = scanner.nextInt();
			int y = x*x - 3*x + 7;
			
			System.out.print("x=" +  x  );
			System.out.println(" y=" + y);
		    scanner.close();
		}

	public static void main(String[] args) {
			Cx add  = new Cx();
			add.run();
	}

}
