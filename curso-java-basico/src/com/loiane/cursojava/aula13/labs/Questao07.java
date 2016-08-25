package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double lado;
		System.out.println("Qual o valor do lado do quadrado : ");
		lado = scan.nextDouble();
		
		System.out.println("O dobro da area do quadrado é: " + (lado*lado) * 2);
	}

}
