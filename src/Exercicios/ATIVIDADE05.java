package Exercicios;

import java.util.Scanner;

public class ATIVIDADE05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int N = 0, SOMA = 0;
		
		do{
			System.out.println("Digite um número: ");
			N = entrada.nextInt();
			
			SOMA = SOMA + N;
			System.out.println("A soma dos números é: " + SOMA);
			
		}
		
		while(N > 0);
		
	entrada.close();
	
	}

}