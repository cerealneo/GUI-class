package ch3;

import java.util.Scanner;

public class Engkor {
	public Engkor() {}
	public void run () {
		Scanner scan = new Scanner(System.in);
		  String eng[] = { "student", "love", "java", "happy", "future" };
		        String kor[] = { "�л�", "���", "�ڹ�", "�ູ��", "�̷�" }; 
		        String s = "";
		        while(true)
		        {
		         int f = 0; //�ʱ�ȭ
		         System.out.print("���� �ܾ  �Է��ϼ��� >>");
		            s = scan.next();       
		            if (s.equals("exit"))
		            {
		             System.out.println("���α׷� �����մϴ�...");
		                break;
		            }
		            for (int i = 0; i < eng.length; i++)
		            {             
		             if (s.equals(eng[i]))
		             {    
		              System.out.println(kor[i]);
		              f = 1;   
		              break;
		                }
		            }
		            if (f==0)
		            {
		             System.out.println("�׷� ���� �ܾ �����ϴ�.");
		      }
		      }
		      scan.close();


	}

	public static void main(String[] args) {
		Engkor add  = new Engkor();
		add.run();

	}

}