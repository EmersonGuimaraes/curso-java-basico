package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
			int numero1 = scan.nextInt();
		System.out.println("Entre com outro n�mero: ");
			int numero2 = scan.nextInt();
		
		if(numero1<numero2){
			System.out.println(numero2 + " � maior que "+ numero1);
		}else{
			System.out.println(numero1 + " � maior que "+ numero2);
		}
		

	}

}
