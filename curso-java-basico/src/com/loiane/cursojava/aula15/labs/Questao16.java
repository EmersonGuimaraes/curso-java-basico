package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, delta, x1 = 0, x2 = 0;
		
		System.out.println("Informe o valor de A: ");	
			a = scan.nextInt();
		System.out.println("Informe o valor de B: ");
			b = scan.nextInt();
		System.out.println("Informe o valor de C: ");
			c = scan.nextInt();
		
		if(a == 0){
			System.out.println("Equação não é do segundo grau.");
			
		}else{
			
			delta = (b * b) - (4 * a * c);
			
			if(delta < 0){
				
				System.out.println("A equação não possui raízes reais.");
				System.out.println("Delta Negativo!");
				
			}else
				 x1 = ((-b) + Math.sqrt(delta) / 2 * a);
				 x2 = ((-b) - Math.sqrt(delta) / 2 * a);
				
				if(delta == 0){
					
					System.out.println("A equação possui uma raíz real.");
					System.out.println("VALOR DE DELTA: "+delta);
					System.out.println("X1 = " + x1);
					System.out.println("X2 = " + x2);
				}else if (delta > 0){
					System.out.println("A equação possui duas raízes reais.");
					System.out.println("VALOR DE DELTA: "+delta);
					System.out.println("X1 = " + x1);
					System.out.println("X2 = " + x2);
				}
		}
				
		
	}

}
