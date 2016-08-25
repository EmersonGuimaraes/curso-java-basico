package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ano;
		System.out.println("Informe um ano: ");
			ano = scan.nextInt();
			
		if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
			System.out.println("Ano bissesto !");
		}else{
				System.out.println("Não é bissesto !");
		}
	}

}
