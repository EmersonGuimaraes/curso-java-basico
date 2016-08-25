package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor 1º produto: ");
		System.out.println("Entre com o valor 2º produto: ");
		System.out.println("Entre com o valor 3º produto: ");
		
		double produto1 = scan.nextDouble();
		double produto2 = scan.nextDouble();
		double produto3 = scan.nextDouble();
		
		if(produto1 < produto2 && produto1<produto3){
			System.out.println(produto1 + " é a melhor oferta.");
		}else if(produto2 < produto1 && produto2<produto3){
			System.out.println(produto2 + " é a melhor oferta.");
		}else if(produto3 < produto2 && produto3<produto1){
			System.out.println(produto3 + " é a melhor oferta.");
		}

	}

}
