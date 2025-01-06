package ch02;
import java.util.Scanner;

public class E05 {
	public E05() {}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요>>");
		boolean a = scanner.nextBoolean();
		String op = scanner.next();
		boolean b = scanner.nextBoolean();
		
		switch(op) {
		case "AND": System.out.println("false");
		break;
		case "OR": System.out.println("true");	
		break;
		default:  System.out.println("입력 값이 잘못 되었습니다 다시 확인해주세요.");
		}
		scanner.close();

	}
	public static void main(String[] args) {
			E05 add  = new E05();
			add.run();

	}

}
