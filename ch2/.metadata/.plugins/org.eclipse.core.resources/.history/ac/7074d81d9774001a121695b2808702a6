package ch02;
import java.util.Scanner;

public class A81 {
	public A81() {}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = scanner.next();
		int count = scanner.nextInt();
		
		if(coffee.equals("에소프레스"))
			System.out.println(2000*count + "원입니다.");
		else if(coffee.equals("아메리카노"))
			System.out.println(2500*count + "원입니다.");
		else if(coffee.equals("카푸치노"))
			System.out.println(3000*count + "원입니다.");
		else if(coffee.equals("카페라떼"))
			System.out.println(3500*count + "원입니다.");
		else System.out.println(coffee + "는 없는 메뉴입니다.");
		scanner.close();
	}
	
	public static void main(String[] args) {
		A81 add  = new A81();
		add.run();

	}

}
