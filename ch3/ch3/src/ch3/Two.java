package ch3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Two {
	public Two() {}
	public void run () {
		Scanner scan = new Scanner(System.in);
		  System.out.print("정수를 입력하세요>>");
		  int Num;
		  try
		  { //예외가 발생할 가능성이 있는 지역
		   Num = scan.nextInt();
		   if(Num % 2 == 0)
		   System.out.println("짝수");
		   else
		   System.out.println("홀수");
		  }
		  catch(InputMismatchException e)
		  { //try문에서 예외 발생시 처리
		   System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
		   System.exit(0);
		  }
		  scan.close();


	}
	public static void main(String[] args) {
		Two add  = new Two();
		add.run();

	}

}
