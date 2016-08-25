package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double grauF, grauC;
		
		System.out.println("Digite a temperatura em gra celsius");
		grauC = scan.nextDouble();
		
		grauF = grauC * 1.8 + 32;
		
		System.out.println("A temperatura "+grauC+"ºC em farenheit é "+grauF);

	}

}
