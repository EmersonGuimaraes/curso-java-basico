package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class QUestao11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero1, numero2, produto;
		double numero3, soma,cubo;
		
		System.out.println("Digite o primeiro n�mero: ");
			numero1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
			numero2 = scan.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
			numero3 = scan.nextDouble();
			
		produto = numero1 * (numero2/2);
		soma = 3 * numero1 + numero3;
		cubo = numero3 * numero3 * numero3;
		
		System.out.println("O produto do dobro do primeiro com a metade do segundo � "+ produto);
		System.out.println("O triplo do primeiro com o terceiro � "+ soma);
		System.out.println("O terceiro ao cubo � "+ cubo);
		

	}

}
