package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		 	int num = scan.nextInt();
		 	
		if(num % 2 == 0){
			System.out.println("Número Par.");
		}else{
			System.out.println("Número Impar.");
		}
	}

}
