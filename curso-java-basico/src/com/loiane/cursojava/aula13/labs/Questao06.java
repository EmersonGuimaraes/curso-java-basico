package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		final float PI = 3.14f;
		float r, area;
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual é o valor do raio: ");
		r = scan.nextFloat();
		
		area = (r * r) * PI;
		System.out.println("A area do circulo é " + area);
		

	}

}
