package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salarioFinal = 0, aumento, reajuste;
		
		System.out.println("Digite seu sal�rio atual");
			double salarioAtual = scan.nextDouble();
		
		if(salarioAtual <= 280){
			reajuste = 20;
		}else if(salarioAtual <= 700){
			reajuste = 15;
		}else if(salarioAtual <= 1500){
			reajuste = 10;
		}else{
			reajuste = 5;
		}
		
		aumento = (reajuste*salarioAtual)/100;
		salarioFinal = salarioAtual + aumento;
		
		System.out.println("Salário antes do reajuste: " + salarioAtual);
		System.out.println("Percentual de aumento: " + reajuste+"%");
		System.out.println("Valor do aumento: " + aumento);
		System.out.println("Novo salário: " + salarioFinal);
	}	

}
