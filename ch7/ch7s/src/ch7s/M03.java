package ch7s;

import java.util.HashMap;
import java.util.Scanner;

public class M03 {

	public static void main(String[] args) {
		HashMap<String, Integer>h = new HashMap<String, Integer>();
		h.put("에스프레소", 2000);
		h.put("아메리카노", 2500);
		h.put("카푸치노", 3000);
		h.put("카페라테", 3500);
		
		System.out.println("에스프레소, 아메리카, 카푸치노, 카페라떼 있습니다.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("주문 >> ");
			String coffee = sc.next();
			if(coffee.equals("그만"))
				break;
			Integer price = h.get(coffee);
			if(price == null)
				System.out.println(coffee + " 메뉴 없습니다.");
			else
				System.out.println(coffee + "는 " + price + "입니다.");			
		}
		sc.close();
		
	}

}
