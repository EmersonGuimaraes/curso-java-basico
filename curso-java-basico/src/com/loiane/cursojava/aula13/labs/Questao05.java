package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		double metros, cm;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os metros: ");
		metros = scan.nextDouble();
		
		cm = metros/0.01;
		
		System.out.println(metros+" metros convertidos em centímetros é "+cm);
	}

}
