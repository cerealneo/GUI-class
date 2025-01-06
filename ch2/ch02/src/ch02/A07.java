package ch02;
import java.util.Scanner;

public class A07 {
	public A07() {}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학점을  입력하세요>>");
		String sc = scanner.next();
		
		switch(sc) {
		case "A": case "B": 
			System.out.println("Excellent");
			break;
			
		case "C": case "D": 
			System.out.println("Good");
			break;
			
		case "F": 
			System.out.println("Bye");
			break;
		
		default:  System.out.println("입력 값이 잘못 되었습니다 다시 확인해주세요.");
		}
		scanner.close();
		
	}
	
	public static void main(String[] args) {
		A07 add  = new A07();
		add.run();

	}

}
