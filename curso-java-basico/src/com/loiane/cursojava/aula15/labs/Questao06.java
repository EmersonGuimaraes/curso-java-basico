package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com 1� n�mero: ");
		System.out.println("Entre com 2� n�mero: ");
		System.out.println("Entre com 3� n�mero: ");
		
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int numero3 = scan.nextInt();
		
		if(numero1>numero2 && numero1>numero3){
			System.out.println(numero1 + " � o maior.");
		}else if(numero2>numero1 && numero2>numero3){
			System.out.println(numero2 + " � o maior.");
		}else if(numero3>numero1 && numero3>numero2){
			System.out.println(numero3 + " � o maior.");
		}else{
			System.out.println("N�meros iguais.");
		}
		
		
	}

}
