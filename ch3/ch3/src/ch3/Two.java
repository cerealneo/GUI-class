package ch3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Two {
	public Two() {}
	public void run () {
		Scanner scan = new Scanner(System.in);
		  System.out.print("������ �Է��ϼ���>>");
		  int Num;
		  try
		  { //���ܰ� �߻��� ���ɼ��� �ִ� ����
		   Num = scan.nextInt();
		   if(Num % 2 == 0)
		   System.out.println("¦��");
		   else
		   System.out.println("Ȧ��");
		  }
		  catch(InputMismatchException e)
		  { //try������ ���� �߻��� ó��
		   System.out.println("���� �Է����� �ʾ� ���α׷� �����մϴ�.");
		   System.exit(0);
		  }
		  scan.close();


	}
	public static void main(String[] args) {
		Two add  = new Two();
		add.run();

	}

}
