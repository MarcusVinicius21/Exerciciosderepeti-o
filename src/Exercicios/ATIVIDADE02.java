package Exercicios;

import java.util.Scanner;

public class ATIVIDADE02 {
		
public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
		int N,RESTO, CALCULO;
		
		for(N=0;N<=10;N++ )
		{
			System.out.println ("Digite um numero: ");
			N = entrada.nextInt();
			CALCULO=N/2;
			RESTO=N%2;
		
		if (RESTO==0) 
		{
			System.out.println("Este numero é par");
		}
			
		else
		{
			System.out.println("Este numero é impar");
		}
		
	}
		
		}

}