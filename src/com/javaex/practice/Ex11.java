package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=num;i++ ) {
			sum = sum+num;
			if(num%i!=0) {
				System.out.println("결과값: "+ sum+num );
			}
		}
		
		
		
		sc.close();
	}

}
