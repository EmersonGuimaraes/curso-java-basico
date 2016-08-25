package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double ladoA, ladoB, ladoC;
		boolean triangulo = false;
		
		System.out.println("Entre com os valores dos lados de um tri�ngulo: ");
		ladoA = scan.nextDouble();
		ladoB = scan.nextDouble();
		ladoC = scan.nextDouble();
		
		if((ladoA+ladoB) > ladoC || 
				(ladoA+ladoC) > ladoB || 
				(ladoB+ladoC) > ladoA){
			
						if(ladoA==ladoB && ladoB==ladoC){
							System.out.println("Triângulo Equilátero");
						}else if(ladoA==ladoB || ladoA == ladoC ||ladoB == ladoC ){
							System.out.println("Triângulo Isósceles");
						}else{
							System.out.println("Triângulo Escaleno");
						}
		}else{
			System.out.println("Não é um triângulo.");
		}

	}

}
