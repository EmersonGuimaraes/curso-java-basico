package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra do alfabeto");
			String letra = scan.next();
			
		switch (letra.toUpperCase()) {
			case "F":System.out.println("F - Femino");break;
			case "M":System.out.println("M - Masculino");break;
			default: System.out.println("Sexo inválido!");break;
		}
		
	}

}
