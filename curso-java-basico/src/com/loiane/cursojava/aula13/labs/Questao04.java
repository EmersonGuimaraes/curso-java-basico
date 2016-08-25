package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a 1º, 2º, 3º e a 4º nota bimestral: ");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		nota3 = scan.nextDouble();
		nota4 = scan.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A sua média é " + media);
	}

}
