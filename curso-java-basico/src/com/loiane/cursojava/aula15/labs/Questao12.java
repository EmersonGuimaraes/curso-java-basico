package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Questao12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora trabalhada: ");
			double valorHora = scan.nextDouble();
		System.out.println("Informe quantas horas voc� trabalhou esse m�s: ");
			double qtdHora = scan.nextDouble();
		
			
		double ir = 0, inss, fgts, totalDescontos, salarioLiquido = 0, sindicato, reajuste;	
		
		double salarioBruto = qtdHora*valorHora;
		
		if(salarioBruto > 900 && salarioBruto <= 1500){
			reajuste = 5;		
		}else if(salarioBruto <= 2500){
			reajuste = 10;
		}else{
			reajuste = 20;
		}
		
		ir = (salarioBruto*reajuste)/100;
		fgts = (salarioBruto*11)/100;
		inss = (salarioBruto*10)/100;
		sindicato = (salarioBruto*3)/100;
		
		totalDescontos = ir+inss;
		salarioLiquido = salarioBruto-totalDescontos;
		
		System.out.println("Sal�rio Bruto: (" + valorHora + "*" + qtdHora + ": R$ "+salarioBruto);
		System.out.println("(-) IR ("+reajuste+"): R$ "+ir);
		System.out.println("(-) INSS (10%): R$ "+inss);
		System.out.println("FGTS (11%): "+"R$ "+fgts);
		System.out.println("Total de descontos: R$ "+totalDescontos);
		System.out.println("Sal�rio Liquido: R$ "+salarioLiquido);
		
		
	}

}
