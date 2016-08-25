package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String resp1, resp2, resp3, resp4, resp5;
		System.out.println("Telefonou para a vítima?(S) SIM ou (N) NÃO)");
			resp1 = scan.next();
		System.out.println("Esteve no local do crime? (S) SIM ou (N) NÃO)");
			resp2 = scan.next();
		System.out.println("Mora com a vítima? (S) SIM ou (N) NÃO)");
			resp3 = scan.next();
		System.out.println("Devia para a vítima? (S) SIM ou (N) NÃO)");
			resp4 = scan.next();
		System.out.println("Já trabalhou com a vítima? (S) SIM ou (N) NÃO)");
			resp5 = scan.next();
			
			int cont = 0;
			
		if(resp1.equalsIgnoreCase("S")){
			cont++;
		}
		
		if(resp2.equalsIgnoreCase("S")){
			cont++;
		}
		
		if(resp3.equalsIgnoreCase("S")){
			cont++;
		}
		
		if(resp4.equalsIgnoreCase("S")){
			cont++;
		}
		
		if(resp5.equalsIgnoreCase("S")){
			cont++;
		}
		
		System.out.println(cont);
		
		if(cont == 2){
			System.out.println("Suspeita.");
			
		}else if(cont == 3 || cont == 4){
			System.out.println("Cumplice.");
			
		}else if(cont==5){
			System.out.println("Culpado.");
			
		}else{
			System.out.println("Inocente.");
		}
	}

}
