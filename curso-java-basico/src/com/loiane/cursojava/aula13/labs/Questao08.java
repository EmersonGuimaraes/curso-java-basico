package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroHora;
		double valorHora, salario;
		
		System.out.println("Quantas horas voc� trabalha por m�s? ");
			numeroHora = scan.nextInt();
		System.out.println("Qual o valor da hora trabalhada?");
			valorHora = scan.nextDouble();
		
		salario = valorHora*numeroHora;
		System.out.println("O seu sal�rio no final do m�s � de " + salario);
		

	}

}
