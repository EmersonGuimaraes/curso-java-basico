package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salarioLiquido, salarioBruto, inss, sindicato, ir, valorHora;
		int numeroHoras;
		System.out.println("Quantas horas você trabalha por mês? ");
			numeroHoras = scan.nextInt();
		System.out.println("Qual o valor da hora trabalhada?");
			valorHora = scan.nextDouble();
			
		salarioBruto = numeroHoras*valorHora;
		ir = (11*salarioBruto)/100;
		inss = (8*salarioBruto)/100;
		sindicato = (5*salarioBruto)/100;
		salarioLiquido = salarioBruto - ir - inss - sindicato;
		
		System.out.println("Seu salário bruto é de "+salarioBruto);
		System.out.println("Você pagou " + inss + " ao INSS");
		System.out.println("Você pagou "+ sindicato + " ao sindicato");
		System.out.println("Seu salário liquido é "+ salarioLiquido);
	}

}
