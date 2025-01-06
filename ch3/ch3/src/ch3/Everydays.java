package ch3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Everydays {
	public Everydays() {}
	public void run() {
		while(true)
		  {
		   Scanner scan = new Scanner(System.in);
		   System.out.print("정수를 입력하세요>>");
		   String day[] = {"일","월","화","수","목","금","토"};
		   try
		   {
		    int i = scan.nextInt(); //문제발생 가능성
		    int j = i % 7;
		    if (i < 0) //음수를 입력 받았을시 종료
		    {
		     System.out.println("프로그램 종료합니다...");
		     System.exit(0);
		     scan.close();
		    }
		    System.out.println(day[j]);
		   }
		   catch(InputMismatchException e)
		   { //정수가 아닌경우 예외처리
		    System.out.println("경고! 수를 입력하지 않았습니다.");
		      } 
		  }


		
	}
	public static void main(String[] args) {
		Everydays add  = new Everydays();
		add.run();
	}
	
}