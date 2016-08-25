package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double grauF, grauC;
		
		System.out.println("Temperatura em Farenheit: ");
			grauF = scan.nextDouble();
		
		grauC = (5*(grauF-32)/9);
		System.out.println("O valor da temperatura em grau Celsius é " + grauC);
		
		
		

	}

}
