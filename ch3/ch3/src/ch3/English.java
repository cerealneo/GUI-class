package ch3;

import java.util.Scanner;

public class English {
	public English() {}
	public void run () {
		
		Scanner scan = new Scanner(System.in);
		  System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>>");
		  String alphabet = scan.next();
		  char c = alphabet.charAt(0);
		  for(char a='a'; a<=c; a++)
		  {
		   for(char b=a; b<=c; b++)
		   {
		    System.out.print(b);
		   }
		   System.out.println();
		  }
		  scan.close();


	}
	

	public static void main(String[] args) {
		English add  = new English();
		add.run();

	}

}
