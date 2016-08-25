package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int max = 10;
		
		System.out.println("Loop de 0 a "+ max);
		while(i < max){
			System.out.println("Número "+ i);
			i++;
		}
		
		do{
			i++;
			System.out.println("Número "+ i);
		}while(i < 15);

	}

}
