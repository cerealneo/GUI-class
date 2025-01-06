package ch02;

import java.util.Scanner;

public class Bhe {
	public Bhe() {}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 층인지 입력하세요>>");
		int  a = scanner.nextInt();
		
		System.out.printf("%dm 입니다", a*5);
		 scanner.close();
	}

	public static void main(String[] args) {
		Bhe building = new Bhe();
		building.run();
		

	}

}
