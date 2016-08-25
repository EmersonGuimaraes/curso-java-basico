package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
			double n1 = scan.nextDouble();
			
		System.out.println("Informe o segundo número: ");
		 	double n2 = scan.nextDouble();
		 	
		 System.out.println("Qual operação deseja realizar: ");
		 System.out.println("(x)-Multiplicação, (+)-Adição, (-)Subtração, (/)Divisão: ");
		 	String op = scan.next();
		 	
		 double result = 0;
		 boolean valido = true;
		 
		 switch(op){
		 	case "x": result = n1*n2; break;
		 	case "+": result = n1+n2; break;
		 	case "-": result = n1-n2; break;
		 	case "/": result = n1/n2; break;
		 	default: System.out.println("Operação inválida.");
		 			 valido = false;
		 }
		 
		 if(valido){
			 if(result > 0){
				 System.out.println("Positivo!");
			 }else{
				 System.out.println("Negativo");
			 }
		 }
		 
		 if(result % 2 == 0){
			 System.out.println("Número Par");
		 }else{
			 System.out.println("Número ímpar");
		 }
		 
		
	}

}
