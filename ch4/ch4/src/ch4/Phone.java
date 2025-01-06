package ch4;

import java.util.Scanner;

public class Phone {
	private String name, tel;
	
	public Phone(String name, String tel) { 
		this.name = name; 
		this.tel = tel;
		}
	
	public String getName() { return name; }
	public String getTel() { return tel; }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름과 전화번호 입력 >>");
		Phone first = new Phone(scanner.next(),scanner.next());
		System.out.print("이름과 전화번호 입력 >>");
		Phone second = new Phone(scanner.next(),scanner.next());
		
		System.out.println(first.getName() + "의 번호 " + first.getTel());
		System.out.println(second.getName() + "의 번호 " + second.getTel());
		scanner.close();
	}

}
