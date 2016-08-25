package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		/*do{
			System.out.println("Numero de 0 a 10");
			num = scan.nextInt();
		}while(num > 10 || num < 0);
		*/
		System.out.println("Numero de 0 a 10");
		while(num < 0 || num > 10){
			System.out.println("Numero de 0 a 10");
			num = scan.nextInt();
		}
	}

}
