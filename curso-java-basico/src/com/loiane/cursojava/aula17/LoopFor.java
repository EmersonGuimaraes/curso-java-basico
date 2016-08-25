package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		//For Normal
		
		for(int i=0; i <= 5; i++){
			System.out.println("O valor de i é " + i);
		}
		
		for(int i = 4; i >= 0; i--){
			System.out.println("O valor de i é "+i);
		}
		
		//For com mais de uma variável.
		
		for(int i = 0, j = 10; i < j; i++, j--){
			System.out.println("O valor de i é "+ i +" e o de j é "+ j);
		}
		
		//For sem partes
		
		int cont= 0;
		for(; cont < 10;){
			System.out.println("O valor de cont é "+ cont);
			cont+=2;
		}
		
		//Loop sem corpo (Comumente utilizado para somar valores )
		
		int soma = 0;
		for (int  i = 1; i<5; soma += i++ ); 
		System.out.println("O valor da soma é "+soma);
	}

}
