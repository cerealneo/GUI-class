package ch02;
import java.util.Scanner;

public class A06 {
	public A06() {}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>>");
		int money = scanner.nextInt();
		
		switch (money / 50000)
        {
        case 0:
            System.out.print("오만원 0개, ");
            break;

        default:
            int n50000 = money / 50000;
            money = money % 50000;
            System.out.print("오만원" + n50000 + "개, ");
            break;
        }

        switch (money / 10000)
        {
        case 0:
            System.out.print("만원 0개, ");
            break;

        default:
            int n10000 = money / 10000;
            money = money % 10000;
            System.out.print("만원" + n10000 + "개, ");
            break;
        }
switch (money / 1000)
        {
        case 0:
            System.out.print("천원 0개, ");
            break;

        default:
            int n1000 = money / 1000;
            money = money % 1000;
            System.out.print("천원" + n1000 + "개, ");
            break;
        }

        switch (money / 500)
        {
        case 0:
            System.out.print("500원 0개, ");
            break;

        default:
            int n500 = money / 500;
            money = money % 500;
            System.out.print("500원" + n500 + "개, ");
            break;
        }

        switch (money / 100)
        {
        case 0:
            System.out.print("100원 0개, ");
            break;

        default:
            int n100 = money / 100;
            money = money % 100;
            System.out.print("100원" + n100 + "개, ");
            break;
        }

        switch (money / 10)
        {
        case 0:
            System.out.print("10원 0개, ");
            break;

        default:
            int n10 = money / 10;
            money = money % 10;
            System.out.print("10원" + n10 + "개, ");
            break;
        }

        switch (money / 1)
        {
        case 0:
            System.out.println("1원 0개");
            break;

        default:
            System.out.println("1원" + money + "개");
            break;
        }

        scanner.close();
		
	}
	
	public static void main(String[] args) {
		A06 add  = new A06();
		add.run();

	}

}
