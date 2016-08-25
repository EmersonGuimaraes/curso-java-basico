package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		String situacao, conceito;
		double media = (nota1+nota2)/2;
		
		if(media >=9 && media <=10){
			situacao = "APROVADO!";
			conceito = "A";
		}else if(media >= 7.5){
			situacao = "APROVADO!";
			conceito = "B";
		}else if(media >=6){
			situacao = "APROVADO!";
			conceito = "C";
		}else if(media >= 4){
			situacao = "REPROVADO!";
			conceito = "D";
		}else{
			situacao = "REPROVADO!";
			conceito = "E";
		}
		
		System.out.println("Primeira nota: "+nota1+"\nSegunda nota: "+nota2);
		System.out.println("M�dia: "+media+"\nConceito: "+conceito);
		System.out.println("Situa��o: "+situacao);
		
	}

}
