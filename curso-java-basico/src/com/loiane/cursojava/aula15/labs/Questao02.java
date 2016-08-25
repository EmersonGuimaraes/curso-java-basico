package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um n�mero: ");
			int numero = scan.nextInt();
		if(numero>=0){
			System.out.println("N�mero positivo");
			
		}else{
			System.out.println("N�mero negativo");
		}
		

	}

}
