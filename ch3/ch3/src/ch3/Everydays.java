package ch3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Everydays {
	public Everydays() {}
	public void run() {
		while(true)
		  {
		   Scanner scan = new Scanner(System.in);
		   System.out.print("������ �Է��ϼ���>>");
		   String day[] = {"��","��","ȭ","��","��","��","��"};
		   try
		   {
		    int i = scan.nextInt(); //�����߻� ���ɼ�
		    int j = i % 7;
		    if (i < 0) //������ �Է� �޾����� ����
		    {
		     System.out.println("���α׷� �����մϴ�...");
		     System.exit(0);
		     scan.close();
		    }
		    System.out.println(day[j]);
		   }
		   catch(InputMismatchException e)
		   { //������ �ƴѰ�� ����ó��
		    System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
		      } 
		  }


		
	}
	public static void main(String[] args) {
		Everydays add  = new Everydays();
		add.run();
	}
	
}