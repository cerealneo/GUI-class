package ch7s;

import java.util.HashMap;
import java.util.Scanner;

public class M03 {

	public static void main(String[] args) {
		HashMap<String, Integer>h = new HashMap<String, Integer>();
		h.put("����������", 2000);
		h.put("�Ƹ޸�ī��", 2500);
		h.put("īǪġ��", 3000);
		h.put("ī�����", 3500);
		
		System.out.println("����������, �Ƹ޸�ī, īǪġ��, ī��� �ֽ��ϴ�.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�ֹ� >> ");
			String coffee = sc.next();
			if(coffee.equals("�׸�"))
				break;
			Integer price = h.get(coffee);
			if(price == null)
				System.out.println(coffee + " �޴� �����ϴ�.");
			else
				System.out.println(coffee + "�� " + price + "�Դϴ�.");			
		}
		sc.close();
		
	}

}