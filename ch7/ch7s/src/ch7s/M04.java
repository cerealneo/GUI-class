package ch7s;

import java.util.Scanner;
import java.util.Vector;

public class M04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("2000 ~ 2009년 까지 1년단위로 키(cm)를 입력");
		System.out.print(">>");

		for(int i = 0; i < 10; i++) {
			v.add(sc.nextInt());
		}
		
		int max = v.get(1) - v.get(0);
		int year = 0;
		for(int i=0;i<9;i++){
			int x = v.get(i+1) - v.get(i);
			if(max<x){
				max = x;
				year = 2000 +i;
			}
		}	
		System.out.println("가장 키가 많이 자란 년도는 " + year + "년 " + (float)max +"cm");
		
		sc.close();
	}
}