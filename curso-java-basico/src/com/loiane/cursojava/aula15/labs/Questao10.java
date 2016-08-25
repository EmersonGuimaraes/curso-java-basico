package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual turno voc� estuda (M-Matutino, V-Vespertino, N-Noturno)?");
			String turno = scan.next();
		
			/*//PRIMEIRA FORMA
			switch(turno.toUpperCase()){
				case "M": System.out.println("Bom dia!"); break;
				case "V": System.out.println("Boa Tarde!"); break;
				case "N": System.out.println("Boa Noite!"); break;
				default: System.out.println("Turno inv�lido!"); break;
			}*/
			
			//SEGUNDA FORMA
			switch(turno){
			case "m":
			case "M": System.out.println("Bom dia!"); break;
			case "v":
			case "V": System.out.println("Boa Tarde!"); break;
			case "n":
			case "N": System.out.println("Boa Noite!"); break;
			default: System.out.println("Turno inv�lido!"); break;
		}
	}

}
