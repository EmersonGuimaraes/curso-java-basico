package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		int numero1, numero2, soma;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = scan.nextInt();
		
		soma = numero1 + numero2;
		System.out.println("A soma dos dois n�meros � " + soma);
		

	}

}
