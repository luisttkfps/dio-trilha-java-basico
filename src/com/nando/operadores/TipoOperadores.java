package com.nando.operadores;

public class TipoOperadores {

	public static void main(String[] args) {
		
		System.out.println("========operadores ariméticos-=======");
		int soma = 5 + 5;
		int subtracao = 5 - 5;
		int multiplicacao = 5 * 5;
		int divisao = 5 / 5;
		double resto = 13 % 2;
		
		System.out.println("Soma = " + soma);
		System.out.println("Subtracao = " + subtracao);
		System.out.println("Multiplicacao = " + multiplicacao);
		System.out.println("Divisao = " + divisao);
		System.out.println("Resto = " + resto);
		
		System.out.println(" ");
		
		System.out.println("==========operadores unários==========");
		int numero = 5; //recebe valor positivo
		System.out.println("Valor positivo " + numero);
		numero = - numero;
		System.out.println("Valor negativo " + numero);
		numero = ++numero;
		System.out.println("Acrescentou +1 ao ultimo valor " + numero);
		numero = --numero;
		System.out.println("Diminuiu -1 ao ultimo valor " + numero);
		
		System.out.println(" ");
	
		System.out.println("=========operadores ternários=========");
		boolean ternario = false;
		
		System.out.println("O ternário é " + ternario);
		ternario = 5 == 5;
		System.out.println("5 é igual a 5 ? " + ternario);
		ternario = 5 > 5;
		System.out.println("5 é maior que 5 ? " + ternario);
		ternario = 5 < 5;
		System.out.println("5 é menor que  5 ? " + ternario);
		ternario = 5 < 6;
		System.out.println("5 é menor que  6 ? " + ternario);
		
		System.out.println(" ");
		
		System.out.println("operadores lógicos");
		boolean logico = 5 == 6 || 6 !=7;
		System.out.println("5 é igual a 6 ou 6 é diferente de 7 ?" + (logico ? " sim" : " não"));
				
		
	}

}
