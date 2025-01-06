package ch3;

import java.util.Scanner;

public class Ten {
	public Ten() {}
	public void run () {
		Scanner scan = new Scanner(System.in);
		  int A[] = new int[10];
		  System.out.print("정수 10개 입력>>");
		  for(int i=0; i<A.length; i++)
		  {
		   A[i] = scan.nextInt();
		  } 
		  for(int i=0; i<A.length; i++)
		  { 
		   if(A[i]%3 == 0)
		    System.out.print(A[i]+" ");
		   else continue;
		  }
		  scan.close();

	}

	public static void main(String[] args) {
		Ten add  = new Ten();
		add.run();
	}

}
