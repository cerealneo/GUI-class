package ch3;

import java.util.Scanner;

public class Tens {
	public Tens() {}
	public void run () {
		Scanner scan = new Scanner(System.in);
		  System.out.print("정수 10개 입력>>"); 
		  int A[] = new int[10];
		  for(int i=0; i<A.length; i++)
		  {
		   A[i] = scan.nextInt();
		  }
		  for(int a=0; a<A.length; a++)
		  {
		   for(int b=a; b<A.length; b++)
		   {            
		    if(A[a]>A[b])
		    {         
		     int tmp = A[a];
		     A[a] = A[b];
		     A[b] = tmp;
		    }
		   }
		  }
		  for(int a=0;a<A.length;a++)
		  {
		   System.out.print(A[a] + " ");
		  }
		  scan.close();

	}

	public static void main(String[] args) {
		Tens add  = new Tens();
		add.run();

	}

}
