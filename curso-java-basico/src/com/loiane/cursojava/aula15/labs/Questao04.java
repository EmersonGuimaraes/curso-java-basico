package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
			String letra = scan.next();
		
			if(letra.length() > 1){
				System.out.println("Letra Inválida!");
			}else{
				switch(letra.toUpperCase()){
					case "A":
					case "E":
					case "I":
					case "O":
					case "U": System.out.println("A letra \""+letra + "\" � uma vogal");break;
					default: System.out.println("A letra \""+letra + "\" � uma consoante");break;
				}
			}
	}

}
